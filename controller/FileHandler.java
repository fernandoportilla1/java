/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.granjaagricola.controller;


import com.mycompany.granjaagricola.model.Animales;
import com.mycompany.granjaagricola.model.Cerdos;
import com.mycompany.granjaagricola.model.Gallinas;
import com.mycompany.granjaagricola.model.Granja;
import com.mycompany.granjaagricola.model.Obreros;
import com.mycompany.granjaagricola.model.Vacas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author fernando
 */
public class FileHandler {
    private static final String ANIMALES_FILE_PATH = "/Users/fernando/Workspace/java/animales.txt";

    public FileHandler() {
    }
    
    
    public String agregarAnimales(Animales animal) throws IOException  {
        File file = new File(ANIMALES_FILE_PATH);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        //System.out.println(trabajador.getClass().getSimpleName());
        
        String identificador = animal.getIdentificador();
        double kilogramos = animal.getKilogramos();
        int cantidadTotalGranja = animal.getCantidadTotalGranja();
        double precioComercial = animal.getPrecioComercial();

        
        if (animal instanceof Gallinas gallina) {
            int cantidadHuevosSemana = gallina.getCantidadHuevosSemana();
            bufferedWriter.append("Gallina:"+cantidadHuevosSemana+","+identificador+","+kilogramos+","+cantidadTotalGranja+","+precioComercial);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        if (animal instanceof Cerdos cerdo) {
            double kilogramosCome = cerdo.getKilogramosCome();
            double agualbeben = cerdo.getAgualbeben();
            bufferedWriter.append("Cerdo:"+kilogramosCome+","+agualbeben+","+identificador+","+kilogramos+","+cantidadTotalGranja+","+precioComercial);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        if (animal instanceof Vacas vaca) {
            boolean daLeche = vaca.getDaLeche();
            bufferedWriter.append("Vaca:"+daLeche+","+identificador+","+kilogramos+","+cantidadTotalGranja+","+precioComercial);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        return "Datos guardados exitosamente.";
    }
    
    public LinkedList<String> cargarAnimales() {
        LinkedList<String> animales = new LinkedList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ANIMALES_FILE_PATH))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datosAnimal = linea.split(":");
                if (datosAnimal.length == 2) {
                    String[] infoAnimal = datosAnimal[1].split(",");
                    
                    switch (datosAnimal[0]) {
                        case "Gallina" -> {
                            Gallinas gallina = new Gallinas(Integer.valueOf(infoAnimal[0]), infoAnimal[1], Double.valueOf(infoAnimal[2]), Integer.valueOf(infoAnimal[3]), Double.valueOf(infoAnimal[4]));
                            animales.add("Gallina," + gallina.getIdentificador() + "," + gallina.calcularIngresos() + "," + gallina.clasificarGallina());
                        }
                        case "Cerdo" -> {
                            Cerdos cerdo = new Cerdos(Double.valueOf(infoAnimal[0]), Double.valueOf(infoAnimal[1]), infoAnimal[2], Double.valueOf(infoAnimal[3]), Integer.valueOf(infoAnimal[4]), Double.valueOf(infoAnimal[5]));
                            animales.add("Cerdo," + cerdo.getIdentificador() + "," + cerdo.calcularIngresos());
                        }
                        default -> {
                            Vacas vaca = new Vacas( Boolean.valueOf(infoAnimal[0]), infoAnimal[1], Double.valueOf(infoAnimal[2]), Integer.valueOf(infoAnimal[3]), Double.valueOf(infoAnimal[4]));
                            animales.add("Vaca," + vaca.getIdentificador() + "," + vaca.calcularIngresos());
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo de vehiculos no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al cargar las vehiculos desde el archivo: " + e.getMessage());
        }
        System.out.println(animales);
        return animales;
    }
    

    public static void main(String[] args) {
        Granja granja = new Granja();

        // Crear usuarios y agregarlos al banco
        Obreros empleado1 = new Obreros("empleado1", "1", "Direccion1", 160);
        Obreros empleado2 = new Obreros("empleado2", "2", "Direccion2", 10);
        Obreros empleado3 = new Obreros("empleado3", "3", "Direccion3", 10);
        
        granja.agregarEmpleado(empleado1);
        granja.agregarEmpleado(empleado2);
        granja.agregarEmpleado(empleado3);
        
        
        System.out.println("Empleados " + granja.totalTrabajandoresCumplen());
        
    }
}

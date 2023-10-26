/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.controller;

import com.mycompany.granjaagricola.model.Animales;
import com.mycompany.granjaagricola.model.Gallinas;
import java.io.*;

/**
 *
 * @author fernando
 */
public class FileHandlerr {
    
    private static final String ANIMAL_PATH = "animal.txt"; 

    public FileHandlerr() {
    }
    
    
    public String guardarArchivo(Animales animal) throws IOException{
        File file = new File(ANIMAL_PATH);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        if(animal instanceof Gallinas gallina) {
            bufferedWriter.append("Animal:"+gallina.calcularIngresos());
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        return "Guardado";
    }
    
    public String recuperarArchuivo() {
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(ANIMAL_PATH))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null ) {
                String[] animal = linea.split(":");
                if(animal.length == 2) {
                    String[] datos =  animal[1].split(":");
                    System.out.println(datos[0]);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
        return "hola";
    }
}

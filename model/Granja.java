/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.model;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class Granja {
    private LinkedList<Obreros>obreros;
    private LinkedList<Animales>animales;

    public Granja() {
        this.obreros = new LinkedList<>();
        this.animales = new LinkedList<>();
    }

    public Granja(LinkedList<Obreros> obreros, LinkedList<Animales> animales) {
        this.obreros = obreros;
        this.animales = animales;
    }

    public LinkedList<Obreros> getObreros() {
        return obreros;
    }

    public void setObreros(LinkedList<Obreros> obreros) {
        this.obreros = obreros;
    }

    public LinkedList<Animales> getAnimales() {
        return animales;
    }

    public void setAnimales(LinkedList<Animales> animales) {
        this.animales = animales;
    }
    
    public void agregarEmpleado(Obreros obrero) {
        obreros.add(obrero);
    }
    
    public void agregarAnimal(Animales animal) {
        animales.add(animal);
    }
    
    public Double totalIngresoGranja() {
         double ingresosTotales = 0;
        for (Animales animal : animales) {
            ingresosTotales += animal.calcularIngresos();
        }
        return ingresosTotales;
    }
    
    public Integer totalTrabajandoresCumplenn() {
        int total = 0;
        for (int linea = 0; linea < obreros.size(); linea++) {
            int horasTrabajandas = (int)obreros.get(linea).getHorasTrabajadas();
            if(horasTrabajandas >= 160) {
                total = total + 1;
            } else if(horasTrabajandas < 80) {
                JOptionPane.showMessageDialog(null, "Faltan horas");
            }
        }
        return total;
    }
    
    public Integer totalTrabajandoresCumplen() {
        int contador = 0;
        for (Obreros trabajador : obreros) {
            if (trabajador.getHorasTrabajadas() >= 160) {
                contador++;
            } else if (trabajador.getHorasTrabajadas() < 80) {
                JOptionPane.showMessageDialog(null, "Obrero con menos de 80 horas trabajadas al mes. " + trabajador.getNombre());
            }
        }
        return contador;
    }
    
    public LinkedList<String> clasificarGallinas() {
        LinkedList<String> gallinasClasificacion = new LinkedList<>();
        
        for (Animales animal : animales) {
            if (animal instanceof Gallinas gallina) {
                int cantidadHuevos = gallina.getCantidadHuevosSemana();
                
                if(cantidadHuevos >0 && cantidadHuevos <= 7) {
                    gallinasClasificacion.add("Gallina " + gallina.getIdentificador() + " " + "Ponedora");
                } else if(cantidadHuevos >=8 && cantidadHuevos <= 14) {
                    gallinasClasificacion.add("Gallina " + gallina.getIdentificador() + "Productiva");
                } else if(cantidadHuevos >14) {
                    gallinasClasificacion.add("Gallina " + gallina.getIdentificador() + "Gallina del mes");
                } else {
                    gallinasClasificacion.add("Gallina " + gallina.getIdentificador() + "Improductiva");
                }
            }
        }
        return gallinasClasificacion;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.model;

/**
 *
 * @author fernando
 */
public class Gallinas extends Animales{
    private Integer cantidadHuevosSemana;

    public Gallinas(Integer cantidadHuevosSemana, String identificador, Double kilogramos, Integer cantidadTotalGranja, Double precioComercial) {
        super(identificador, kilogramos, cantidadTotalGranja, precioComercial);
        this.cantidadHuevosSemana = cantidadHuevosSemana;
    }

    public Integer getCantidadHuevosSemana() {
        return cantidadHuevosSemana;
    }

    public void setCantidadHuevosSemana(Integer cantidadHuevosSemana) {
        this.cantidadHuevosSemana = cantidadHuevosSemana;
    }
    
    public String clasificarGallina() {
        String gallinasClasificacion;
        if(cantidadHuevosSemana >0 && cantidadHuevosSemana <= 7) {
            gallinasClasificacion = "Ponedora";
        } else if(cantidadHuevosSemana >=8 && cantidadHuevosSemana <= 14) {
            gallinasClasificacion = "Productiva";
        } else if(cantidadHuevosSemana >14) {
            gallinasClasificacion = "Gallina del mes";
        } else {
            gallinasClasificacion = "Improductiva";
        }
        return gallinasClasificacion;
    }
}

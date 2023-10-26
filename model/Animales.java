/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.model;

/**
 *
 * @author fernando
 */
public class Animales {
    private String identificador;
    private Double kilogramos;
    private Integer cantidadTotalGranja;
    private Double precioComercial;

    public Animales(String identificador, Double kilogramos, Integer cantidadTotalGranja, Double precioComercial) {
        this.identificador = identificador;
        this.kilogramos = kilogramos;
        this.cantidadTotalGranja = cantidadTotalGranja;
        this.precioComercial = precioComercial;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Double getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(Double kilogramos) {
        this.kilogramos = kilogramos;
    }

    public Integer getCantidadTotalGranja() {
        return cantidadTotalGranja;
    }

    public void setCantidadTotalGranja(Integer cantidadTotalGranja) {
        this.cantidadTotalGranja = cantidadTotalGranja;
    }

    public Double getPrecioComercial() {
        return precioComercial;
    }

    public void setPrecioComercial(Double precioComercial) {
        this.precioComercial = precioComercial;
    }
    
    public double calcularIngresos() {
        return (kilogramos * cantidadTotalGranja) * precioComercial;
    }
}

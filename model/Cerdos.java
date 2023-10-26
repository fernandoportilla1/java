/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.model;

/**
 *
 * @author fernando
 */
public class Cerdos extends Animales{
    private Double kilogramosCome;
    private Double agualbeben;

    public Cerdos(Double kilogramosCome, Double agualbeben, String identificador, Double kilogramos, Integer cantidadTotalGranja, Double precioComercial) {
        super(identificador, kilogramos, cantidadTotalGranja, precioComercial);
        this.kilogramosCome = kilogramosCome;
        this.agualbeben = agualbeben;
    }

    public Double getKilogramosCome() {
        return kilogramosCome;
    }

    public void setKilogramosCome(Double kilogramosCome) {
        this.kilogramosCome = kilogramosCome;
    }

    public Double getAgualbeben() {
        return agualbeben;
    }

    public void setAgualbeben(Double agualbeben) {
        this.agualbeben = agualbeben;
    }
    
    
}

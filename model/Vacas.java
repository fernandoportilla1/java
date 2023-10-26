/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.model;

/**
 *
 * @author fernando
 */
public class Vacas extends Animales{
    private Boolean daLeche;

    public Vacas(Boolean daLeche, String identificador, Double kilogramos, Integer cantidadTotalGranja, Double precioComercial) {
        super(identificador, kilogramos, cantidadTotalGranja, precioComercial);
        this.daLeche = daLeche;
    }

    public Boolean getDaLeche() {
        return daLeche;
    }

    public void setDaLeche(Boolean daLeche) {
        this.daLeche = daLeche;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granjaagricola.controller;

/**
 *
 * @author fernando
 */
public class MisValidaciones {
    public void EspaciosEnBlanco(String cadena) throws MisExcepciones {
        if (cadena.length()!= 5) {
            throw new MisExcepciones("El idenditificador solo debe contener 5 caracteres");
        }
        for (int i =0; i< cadena.length();i++) {

        if (cadena.contains(" ")) {
            throw new MisExcepciones("El idenditificador no pude contener espacios en blanco");
        }
      }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 *
 * @author nikit
 */
public class Llibre extends Producte {
     public Llibre(int id, String nom, double preu) {
        super(id, nom, preu);
    }
    
    
    public double calcularPreuTotal() {
        return preu * 1.10; // 10% d'impostos
    }
}

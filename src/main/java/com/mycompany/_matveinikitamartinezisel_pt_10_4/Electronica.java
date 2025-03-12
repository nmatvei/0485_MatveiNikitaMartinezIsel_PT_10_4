/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 *
 * @author dam1
 */
public class Electronica extends Producte{
    public Electronica(int id, String nom, double preu) {
        super(id, nom, preu);
    }
    
    
    public double calcularPreuTotal() {
        return preu * 1.15; // 15% d'impostos
    }
    
}

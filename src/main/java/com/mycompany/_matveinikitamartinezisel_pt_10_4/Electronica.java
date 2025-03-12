package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Electronica de la classe Producte
 * 
 * @author dam1
 */
public class Electronica extends Producte{
    
    public Electronica(int id, String nom, double preu) {
        super(id, nom, preu);
    }
    
    @Override
    public double calcularPreu() {
        double preuTotal = this.preu * 1.15;
        return preuTotal;
    }
    
}

package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Roba de la classe Producte
 * @author dam1
 */
public class Roba extends Producte {
    public Roba(int id, String nom, double preu) {
        super(id, nom, preu);
    }
    
    
    @Override
    public double calcularPreu(){
        double preuTotal = this.preu * 1.20;
        return preuTotal;
    }
}

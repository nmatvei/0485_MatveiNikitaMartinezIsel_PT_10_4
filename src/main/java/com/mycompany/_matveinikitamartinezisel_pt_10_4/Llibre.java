package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse LLibre de la classe Producte
 * 
 * @author nikita i isel
 */
public class Llibre extends Producte {
     public Llibre(int id, String nom, double preu) {
        super(id, nom, preu);
    }
    
    @Override
    public double calcularPreu(){
        double preuTotal = this.preu * 1.10;
        return preuTotal;
    }
}

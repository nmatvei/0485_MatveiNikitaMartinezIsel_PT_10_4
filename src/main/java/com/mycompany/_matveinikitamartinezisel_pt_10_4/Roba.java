package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Roba de la classe Producte
 * 
 * @author nikita i isel
 */
public class Roba extends Producte {
    /*Declaració de variables*/
    final static double IMPOST_PRODUCTE = 1.2;
    
    /**
     * Constructor de la classe que truca al cosntructor de la superclasse
     * 
     * @param id
     * @param nom
     * @param preu
     * @throws Exception 
     */
    public Roba(int id, String nom, double preu) throws Exception{
        super(id, nom, preu);
    }
    
    /**
     * Mètode sobrescrit calcularPreu, heredat de la superclasse Producte, que
     * agrega un impost del 20% al preu.
     * 
     * @return preuTotal
     */
    @Override
    public double calcularPreu(){
        double preuTotal = this.preu * IMPOST_PRODUCTE;
        return preuTotal;
    }
}

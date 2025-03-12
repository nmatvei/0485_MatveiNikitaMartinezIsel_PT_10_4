package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Electronica de la classe Producte
 *
 * @author nikita i isel
 */
public class Electronica extends Producte {
    /*Declaració de variables*/
    final static double IMPOST_ELECTRONICA = 1.15;
    
    /**
     * Constructor de la classe que truca al cosntructor de la superclasse
     *
     * @param id
     * @param nom
     * @param preu
     * @throws Exception
     */
    public Electronica(int id, String nom, double preu) throws Exception {
        super(id, nom, preu);
    }

    /**
     * Mètode sobrescrit calcularPreu, heredat de la superclasse Producte, que
     * agrega un impost del 15% al preu.
     *
     * @return preuTotal
     */
    @Override
    public double calcularPreu() {
        /*Declarem la variable on amplicarem el impost del 15%*/
        double preuTotal = this.preu * IMPOST_ELECTRONICA;
        
        /*Retornem el preu calculat*/
        return preuTotal;
    }

}

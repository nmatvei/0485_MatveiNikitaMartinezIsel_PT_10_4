package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Llibre de la classe Producte
 *
 * @author nikita i isel
 */
public class Llibre extends Producte {
    /*Declaració de variables*/
    final static double IMPOST_LLIBRE = 1.1;
    
    /**
     * Constructor de la classe que truca al cosntructor de la superclasse
     *
     * @param id
     * @param nom
     * @param preu
     * @throws Exception
     */
    public Llibre(int id, String nom, double preu) throws Exception {
        super(id, nom, preu);
    }

    /**
     * Mètode sobrescrit calcularPreu, heredat de la superclasse Producte, que
     * agrega un impost del 10% al preu.
     *
     * @return preuTotal
     */
    @Override
    public double calcularPreu() {
        /*Declarem la variable on amplicarem el impost del 10%*/
        double preuTotal = this.preu * IMPOST_LLIBRE;

        /*Retornem el preu calculat*/
        return preuTotal;
    }
}

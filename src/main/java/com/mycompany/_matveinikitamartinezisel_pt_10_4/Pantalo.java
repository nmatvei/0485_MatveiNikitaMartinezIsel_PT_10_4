package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Pantalo de la classe Roba
 * 
 * @author nikita i isel
 */
public class Pantalo extends Roba{
    /*Declaració d'atributs*/
    private String disseny;
    
    /**
     * Cosntructor de la classe que truca al constructor de la classe Roba
     * 
     * @param id
     * @param nom
     * @param preu
     * @param material
     * @param color
     * @param disseny
     * @throws Exception 
     */
    public Pantalo(int id, String nom, double preu, String material, String color, String disseny) throws Exception {
        super(id, nom, preu, material, color);
        this.disseny = disseny;
    }
    
    /**
     * Mètode GET per conseguir el disseny
     * 
     * @return disseny
     */
    public String getDisseny() {
        return disseny;
    }
    
    /**
     * Mètode SET per canviar el disseny
     * 
     * @param disseny 
     */
    public void setDisseny(String disseny) {
        this.disseny = disseny;
    }
}

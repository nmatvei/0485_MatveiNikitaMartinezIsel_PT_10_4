package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Sabates de la classe Roba
 * 
 * @author nikita i isel
 */
public class Sabates extends Roba{
    /*Declaració d'atributs*/
    private String marca;
    
    /**
     * Constructor de la classe que truca al constructor de la classe Roba
     * 
     * @param id
     * @param nom
     * @param preu
     * @param material
     * @param color
     * @param marca
     * @throws Exception 
     */
    public Sabates(int id, String nom, double preu, String material, String color, String marca) throws Exception {
        super(id, nom, preu, material, color);
        this.marca = marca;
    }
    
    /**
     * Mètode GET per conseguir la marca
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Mètode SET per canviar la marca
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }    
}

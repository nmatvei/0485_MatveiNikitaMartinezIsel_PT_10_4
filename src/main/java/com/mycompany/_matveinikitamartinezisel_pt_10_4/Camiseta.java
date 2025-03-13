package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Camiseta de la classe Roba
 *
 * @author nikita i isel
 */
public class Camiseta extends Roba{
    /*Declaració d'atributs*/
    private String talla;
    
    /**
     * Constructor de la classe que truca al constructor de la classe Roba
     * 
     * @param id
     * @param nom
     * @param preu
     * @param material
     * @param color
     * @param talla
     * @throws Exception 
     */
    public Camiseta(int id, String nom, double preu, String material, String color, String talla) throws Exception {
        super(id, nom, preu, material, color);
        this.talla = talla;
    }
    
    /**
     * Mètode GET per conseguir la talla
     * 
     * @return talla
     */
    public String getTalla() {
        return talla;
    }
    
    /**
     * Mètode SET per canviar la talla
     * 
     * @param talla 
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }
}
package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Subclasse Roba de la classe Producte
 * 
 * @author nikita i isel
 */
public class Roba extends Producte {
    /*Declaració de variables i atributs*/
    protected String material;
    protected String color;
    final static double IMPOST_PRODUCTE = 1.2;
    
    /**
     * Constructor de la classe que truca al cosntructor de la superclasse
     * 
     * @param id
     * @param nom
     * @param preu
     * @param material
     * @throws Exception 
     */
    public Roba(int id, String nom, double preu, String material, String color) throws Exception{
        super(id, nom, preu);
        this.material = material;
        this.color = color;
    }
    
    /**
     * Mètode sobrescrit calcularPreuTotal, heredat de la superclasse Producte, 
     * que agrega un impost del 20% al preu.
     * 
     * @return preuTotal
     */
    @Override
    public double calcularPreuTotal(){
        double preuTotal = this.preu * IMPOST_PRODUCTE;
        return preuTotal;
    }
    
    /**
     * Mètode GET per conseguir el material
     * 
     * @return material
     */
    public String getMaterial() {
        return material;
    }
    
    /**
     * Mètode GET per conseguir el color
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Mètode SET per canviar el material
     * 
     * @param material 
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * Mètode SET per canviar el color
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
}

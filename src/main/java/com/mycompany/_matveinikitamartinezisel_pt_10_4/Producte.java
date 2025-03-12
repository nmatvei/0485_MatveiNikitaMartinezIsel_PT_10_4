package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Classe abstracta Producte
 * 
 * @author nikita i isel
 */
abstract class Producte {
    /*Declaració d'atributs*/
    protected int id;
    protected String nom; 
    protected double preu;
    
    
    
    /**
     * Mètode GET que retorna l'id
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Mètode GET que retorna el nom
     * @return nom  
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Mètode GET que retorna el preu
     * @return preu 
     */
    public double getPreu() {
        return preu;
    }
    
    /**
     * Mètode SET per canviar l'id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Mètode SET per canviar el nom
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * Mètode SET per canviar el preu
     * @param preu 
     */
    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    /**
     * Mètode abstracte calcularPreu
     */
    public abstract void calcularPreu();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
     * Métode GET que retorna l'id
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
     * Mètode Get que retorna el preu
     * @return preu 
     */
    
  

    public double getPreu() {
        return preu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
    
    public abstract void calcularPreu();
}

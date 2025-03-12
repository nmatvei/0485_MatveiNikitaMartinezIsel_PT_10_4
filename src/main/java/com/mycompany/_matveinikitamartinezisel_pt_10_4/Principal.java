package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 *
 * @author nikita i isel
 */
public class Principal {

     public static void main(String[] args) {
        Producte llibre = new Llibre(1, "El Senyor dels Anells", 20.0);
        Producte electronica = new Electronica(2, "Auriculars Bluetooth", 50.0);
        Producte roba = new Roba(3, "Jaqueta", 40.0);
        
        System.out.println("Preu total del llibre: " + llibre.calcularPreu() + "€");
        System.out.println("Preu total de l'electrònica: " + electronica.calcularPreu() + "€");
        System.out.println("Preu total de la roba: " + roba.calcularPreu() + "€");
    }
}

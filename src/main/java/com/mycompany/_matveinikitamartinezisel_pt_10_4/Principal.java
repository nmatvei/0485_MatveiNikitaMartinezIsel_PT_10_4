package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 *
 * @author nikita i isel
 */
public class Principal {
    public static void main(String[] args) {
        try{
            Llibre llibre = new Llibre(1, "El Senyor dels Anells", 20.0);
            Electronica electronica = new Electronica(2, "Auriculars Bluetooth", 50.0);
            Roba roba = new Roba(3, "Jaqueta", 40.0);

            System.out.println("Preu total del llibre: " + llibre.calcularPreu() + "€");
            System.out.println("Preu total de l'electrònica: " + electronica.calcularPreu() + "€");
            System.out.println("Preu total de la roba: " + roba.calcularPreu() + "€");
        } catch (Exception e){
            System.err.println(e);
        }
        
    }
}

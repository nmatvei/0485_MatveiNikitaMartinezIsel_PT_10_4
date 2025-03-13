package com.mycompany._matveinikitamartinezisel_pt_10_4;

/**
 * Script on es proven les subclasses de la classe Producte (Llibre, Electronica
 * i Roba).
 * 
 * @author nikita i isel
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("PROVES PER DEMOSTRAR EL FUNCIONAMENT DE LES CLASSES"
        + " LLIBRE, ELECTRONICA I ROBA DERIVADES DE LA CLASSE ABSTRACTE PRODUCTE");
        
        /*Estructura TRY-CATCH per captar les execepcions que es puguin produir*/
        try{
            System.out.println("\nDECLAREM 3 OBJECTES (un de Llibre, un d'Electronica i un de Roba)");
            /*Declaració i dades del llibre*/
            Llibre llibre = new Llibre(1, "El Senyor dels Anells", 20.0);
            System.out.println("\n\tOBJECTE LLIBRE:");
            System.out.println("\t\tId: " + llibre.getId());
            System.out.println("\t\tNom: " + llibre.getNom());
            System.out.println("\t\tPreu: " + llibre.getPreu());
            
            /*Declaració i dades de l'electronica*/
            Electronica electronica = new Electronica(2, "Auriculars Bluetooth", 50.0);
            System.out.println("\n\tOBJECTE ELECTRONICA:");
            System.out.println("\t\tId: " + electronica.getId());
            System.out.println("\t\tNom: " + electronica.getNom());
            System.out.println("\t\tPreu: " + electronica.getPreu());
            
            /*Declarció i dades de roba*/
            Roba roba = new Roba(3, "Jaqueta", 40.0, "Polièster", "Vermell");
            System.out.println("\n\tOBJECTE ROBA:");
            System.out.println("\t\tId: " + roba.getId());
            System.out.println("\t\tNom: " + roba.getNom());
            System.out.println("\t\tPreu: " + roba.getPreu());
            System.out.println("\t\tMaterial: " + roba.getMaterial());
            System.out.println("\t\tColor: " + roba.getColor());
            
            /*Demostració del mètode calcularPreuTotal en cada classe*/
            System.out.println("\nARA PROVAREM EL MÈTODE HEREDAT DE LA CLASSE ABSTRACTE PER A CADA OBJECTE QUE HEREDA D'ELLA");
            System.out.println("\n\tPreu total del llibre: " + llibre.calcularPreuTotal() + "€");
            System.out.println("\tPreu total de l'electrònica: " + electronica.calcularPreuTotal() + "€");
            System.out.println("\tPreu total de la roba: " + roba.calcularPreuTotal() + "€");
            
            /*Proves dels objectes depenents de la classe Roba*/
            System.out.println("\nARA RELITZAREM PROVES DE LES CLASSES QUE HEREDEN DE LA CLASSE ROBA");
            System.out.println("\nDECLAREM 3 OBJECTES (una Camiseta, una Sabata i un Pantalo)");
            
            /*Declaració i dades de camiseta*/
            Camiseta camiseta = new Camiseta(4, "Camiseta negra", 15.0, "Cotó", "Negre", "L");
            System.out.println("\n\tOBJECTE Camiseta:");
            System.out.println("\t\tId: " + camiseta.getId());
            System.out.println("\t\tNom: " + camiseta.getNom());
            System.out.println("\t\tPreu: " + camiseta.getPreu());
            System.out.println("\t\tMaterial: " + camiseta.getMaterial());
            System.out.println("\t\tColor: " + camiseta.getColor());
            System.out.println("\t\tTalla: " + camiseta.getTalla());
            System.out.println("\t\tPreu total: " + camiseta.calcularPreuTotal());
            
            /*Declaració i dades de sabates*/
            Sabates sabates = new Sabates(5, "Bambes", 120.0, "Cuir", "Blanc", "Nike");
            System.out.println("\n\tOBJECTE Sabates:");
            System.out.println("\t\tId: " + sabates.getId());
            System.out.println("\t\tNom: " + sabates.getNom());
            System.out.println("\t\tPreu: " + sabates.getPreu());
            System.out.println("\t\tMaterial: " + sabates.getMaterial());
            System.out.println("\t\tColor: " + sabates.getColor());
            System.out.println("\t\tMarca: " + sabates.getMarca());
            System.out.println("\t\tPreu total: " + sabates.calcularPreuTotal());
            
            /*Declaració i dades de pantalo*/
            Pantalo pantalo = new Pantalo(6, "Pantalons", 80.0, "Cotó", "Blau", "Baggy");
            System.out.println("\n\tOBJECTE Sabates:");
            System.out.println("\t\tId: " + pantalo.getId());
            System.out.println("\t\tNom: " + pantalo.getNom());
            System.out.println("\t\tPreu: " + pantalo.getPreu());
            System.out.println("\t\tMaterial: " + pantalo.getMaterial());
            System.out.println("\t\tColor: " + pantalo.getColor());
            System.out.println("\t\tDisseny: " + pantalo.getDisseny());
            System.out.println("\t\tPreu total: " + pantalo.calcularPreuTotal());

        } catch (Exception e){
            System.err.println(e);
        }  
    }
}

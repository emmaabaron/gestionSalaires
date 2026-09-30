/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tests applicatifs
        Developpeur d = new Developpeur("Durand", "Michel", 4,"Développeur");
        Manager m = new Manager("Dupont", "Lucie", 2, "Manager");
        Administratif a = new Administratif("Paul", "Pierre",1,"Administratif");
        
        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
        System.out.println(a.getDescription());
    }
    
}

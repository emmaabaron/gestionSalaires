package gestionsalaires;

import java.util.ArrayList;

public class Service {
    private ArrayList <Employes> employes;

    public Service() {
        this.employes = new ArrayList<Employes>();
    }
    public void ajouterEmployes(Employes e){
        employes.add(e);
    }

    public void listerEmployes(){
        System.out.println(" ");
        System.out.println("----------- Description des employés -----------");
        System.out.println(" ");
    for (Employes e :employes){
            System.out.println(e.getDescription());
        }
    }

    public void calculSalaireTotal(){
        double somme =0;
        for (Employes e : employes){
            somme+=e.getSalaire();
        }
        System.out.println("La somme totale des salaires est : "+somme+"€");
    }
}

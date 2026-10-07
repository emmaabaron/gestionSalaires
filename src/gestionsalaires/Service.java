package gestionsalaires;

import java.util.ArrayList;

public class Service {
    private ArrayList <Employes> employes;

    public Service() {
        this.employes = new ArrayList<Employes>();
    }
    public void listerEmployes(Employes e){
        employes.add(e);
    }
    public void calculSalaireTotal(){
        double somme =0;
        for (Employes e : employes){
            somme+=e.getSalaire();
        }
        System.out.println("La somme totale des salaires est : "+somme+"€");
    }
}

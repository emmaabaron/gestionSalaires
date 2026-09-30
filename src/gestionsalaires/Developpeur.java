/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employes{

    private String langage;

    public Developpeur(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete,"Developpeur");
        this.langage=langage;
    }

    @Override
    public int getSalaire(){
        if (langage.equals("java") ){
            return (1900+anciennete*100+50);
        }
        if (langage.equals("python")){
            return(1900+anciennete*100+70);
        }
        if (langage.equals("php")){
            return(1900+anciennete*100+45);
        }
        else {
            return (1900+anciennete*100);
        }
    }

    @Override
    public String getDescription() {
        return nom+" "+prenom+" est "+poste+" en "+langage+" depuis "+anciennete+" ans et gagne "+getSalaire()+" €.";
    }
}

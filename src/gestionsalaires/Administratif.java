package gestionsalaires;

public class Administratif extends Employes {

    public Administratif(String nom, String prenom, int anciennete, String poste) {
        super(nom, prenom, anciennete, poste);
    }

    @Override
    public int getSalaire() {
        return (1900);
    }
}

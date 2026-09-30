package gestionsalaires;

public class Administratif extends Employes {

    public Administratif(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "Administratif");
    }

    @Override
    public int getSalaire() {
        return (1900);
    }
}

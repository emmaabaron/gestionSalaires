package gestionsalaires;

public class DeveloppeurExpert extends Developpeur{

    public DeveloppeurExpert(String nom, String prenom, int anciennete, String poste, String langage) {
        super(nom, prenom, anciennete, poste, langage);
    }

    @Override
    public int getSalaire() {
        return (int) (super.getSalaire()*1.1);
    }
}

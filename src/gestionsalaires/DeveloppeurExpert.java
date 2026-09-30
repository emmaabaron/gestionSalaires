package gestionsalaires;

public class DeveloppeurExpert extends Developpeur{

    public DeveloppeurExpert(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, langage);
        this.poste="Développeur Expert";
    }

    @Override
    public int getSalaire() {
        return (int) (super.getSalaire()*1.1);
    }
}

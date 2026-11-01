package STRATEGY;

public class Guerrier extends Personnage {
    public Guerrier(String pseudo, int pv, int niveau) {
        super(pseudo, pv, niveau);
        ajouterAttaque(new AttaqueGuerrier());
    }
}

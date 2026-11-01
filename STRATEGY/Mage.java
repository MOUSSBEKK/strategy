package STRATEGY;

public class Mage extends Personnage {
    public Mage(String pseudo, int pv, int niveau) {
        super(pseudo, pv, niveau);
        ajouterAttaque(new AttaqueMage());
    }
}

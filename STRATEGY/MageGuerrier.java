package STRATEGY;

// Grâce au pattern Strategy, pas besoin d'héritage multiple :
// on combine simplement les deux stratégies d'attaque.
public class MageGuerrier extends Personnage {
    public MageGuerrier(String pseudo, int pv, int niveau) {
        super(pseudo, pv, niveau);
        ajouterAttaque(new AttaqueGuerrier());
        ajouterAttaque(new AttaqueMage());
    }
}

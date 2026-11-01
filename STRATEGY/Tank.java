package STRATEGY;

public class Tank extends Personnage {
    // Le Tank encaisse : pas d'attaque par défaut, on peut lui en donner une plus tard
    public Tank(String pseudo, int pv, int niveau) {
        super(pseudo, pv, niveau);
    }
}

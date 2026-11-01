package STRATEGY;

import java.util.ArrayList;
import java.util.List;

public abstract class Personnage {
    private String pseudo;
    private int pv;
    private int niveau;

    // Les comportements d'attaque sont délégués à des stratégies (pattern Strategy)
    private List<Attaque> attaques = new ArrayList<>();

    public Personnage(String pseudo, int pv, int niveau) {
        this.pseudo = pseudo;
        this.pv = pv;
        this.niveau = niveau;
    }

    public void seDeplacer() {
        System.out.println(pseudo + " se déplace.");
    }

    public void attaquer() {
        if (attaques.isEmpty()) {
            System.out.println(pseudo + " n'a aucune attaque et se contente de regarder méchamment.");
            return;
        }
        System.out.println(pseudo + " attaque :");
        for (Attaque attaque : attaques) {
            attaque.faire();
        }
    }

    public void manger() {
        pv += 10;
        System.out.println(pseudo + " mange et récupère 10 PV (PV : " + pv + ").");
    }

    // Ajouter une stratégie d'attaque (permet de cumuler plusieurs styles)
    public void ajouterAttaque(Attaque attaque) {
        attaques.add(attaque);
    }

    // Remplacer toutes les attaques par une seule (changement de stratégie à l'exécution)
    public void setAttaque(Attaque attaque) {
        attaques.clear();
        attaques.add(attaque);
    }

    public String getPseudo() { return pseudo; }
    public int getPv() { return pv; }
    public int getNiveau() { return niveau; }

    public void setPv(int pv) { this.pv = pv; }
    public void setNiveau(int niveau) { this.niveau = niveau; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + pseudo + ", PV=" + pv + ", niv=" + niveau + "]";
    }
}

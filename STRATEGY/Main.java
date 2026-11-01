package STRATEGY;

public class Main {
    public static void main(String[] args) {
        Personnage guerrier = new Guerrier("Conan", 150, 5);
        Personnage mage = new Mage("Merlin", 80, 7);
        Personnage tank = new Tank("Rocky", 300, 4);
        Personnage hybride = new MageGuerrier("Gandalf le Bourrin", 120, 10);

        guerrier.attaquer();
        mage.attaquer();
        tank.attaquer();
        hybride.attaquer();

        // Changement de stratégie à l'exécution : le Tank apprend à frapper
        tank.setAttaque(new AttaqueGuerrier());
        tank.attaquer();

        hybride.seDeplacer();
        hybride.manger();
        System.out.println(hybride);
    }
}

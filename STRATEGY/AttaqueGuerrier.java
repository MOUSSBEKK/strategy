package STRATEGY;

public class AttaqueGuerrier implements Attaque {
    @Override
    public void faire() {
        System.out.println("  > coup d'épée dévastateur !");
    }
}

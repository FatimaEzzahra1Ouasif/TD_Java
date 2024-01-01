package exercice5;
class Vehicule {
    private int nbPassager;

    public Vehicule(int n) {
        nbPassager = n;
    }

    @Override
    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}
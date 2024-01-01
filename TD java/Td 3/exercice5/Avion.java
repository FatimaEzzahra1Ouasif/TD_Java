package exercice5;
class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbP) {
        super(nbP);
    }

    public Avion(int nbP, int nbM) {
        this(nbP); // Utilisation de this pour appeler le constructeur avec un seul paramètre
        nbMoteur = nbM;
    }
}
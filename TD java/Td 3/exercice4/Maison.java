package exercice4;
class Maison extends Batiment {
    private int nbChambres;

    // Constructeurs
    public Maison() {
        super();
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    // Accesseurs et mutateurs
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Maison [adresse=" + getAdresse() + ", nbChambres=" + nbChambres + "]";
    }
}

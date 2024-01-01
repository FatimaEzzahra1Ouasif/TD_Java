package exercice4;
class Immeuble extends Batiment {
    private int nbAppart;

    // Constructeurs
    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    // Accesseurs et mutateurs
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Immeuble [adresse=" + getAdresse() + ", nbAppart=" + nbAppart + "]";
    }
}

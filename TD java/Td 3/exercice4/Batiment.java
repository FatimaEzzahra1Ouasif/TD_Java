package exercice4;
class Batiment {
    private String adresse;

    // Constructeurs
    public Batiment() {
        this.adresse = "Adresse par défaut";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    // Accesseurs et mutateurs
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Batiment [adresse=" + adresse + "]";
    }
}


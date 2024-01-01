package exercice6;

class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {
        super();
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur) {
        super();
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle [nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}

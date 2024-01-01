package exercice5;
Copy code
public class Rectangle {
    private double longueur;
    private double largeur;

    // Constructeurs
    public Rectangle() {
        this.longueur = 1.0; // Valeur par défaut
        this.largeur = 1.0; // Valeur par défaut
    }

    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    public Rectangle(Rectangle autreRectangle) {
        this.longueur = autreRectangle.longueur;
        this.largeur = autreRectangle.largeur;
    }

    // Accesseurs et mutateurs avec vérification des valeurs positives
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive.");
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive.");
        }
    }

    // Méthodes
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public double aire() {
        return longueur * largeur;
    }

    public boolean isCarre() {
        return longueur == largeur;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}

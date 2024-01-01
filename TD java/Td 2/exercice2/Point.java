package exercice2;

public class Point {
    private double abscisse;
    private double ordonnee;

    // Constructeur par défaut
    public Point() {
        this.abscisse = 0.0;
        this.ordonnee = 0.0;
    }

    // Constructeur d'initialisation
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    // Getters et setters
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    // Méthode pour calculer la distance entre l'origine et le point
    public double norme() {
        return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
    }

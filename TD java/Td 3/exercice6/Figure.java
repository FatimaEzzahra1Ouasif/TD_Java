package exercice6;
abstract class Figure {
    protected String nom;

    public Figure() {
        this.nom = "Figure";
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Figure [nom=" + nom + "]";
    }
}

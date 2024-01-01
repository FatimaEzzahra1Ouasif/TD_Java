abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe() {
        this.nom = "Nom";
        this.prenom = "Prenom";
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double gains();

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
    }
}


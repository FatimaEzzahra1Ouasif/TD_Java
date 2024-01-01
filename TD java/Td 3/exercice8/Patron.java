package exercice8;
class Patron extends EmployeBase {
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patron [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
    }
}

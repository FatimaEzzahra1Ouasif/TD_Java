package exercice8;
interface Employe {
    double gains();
}

class EmployeBase implements Employe {
    protected String nom;
    protected String prenom;

    public EmployeBase(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public double gains() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
    }
}


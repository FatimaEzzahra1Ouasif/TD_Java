package exercice1;
class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Rayon : " + rayon);
    }
}

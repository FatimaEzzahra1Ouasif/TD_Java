package exercice1;

public class Point {
    public class Point {
        private char nom;
        private double abscisse;

        // Constructeur
        public Point(char nom, double abscisse) {
            this.nom = nom;
            this.abscisse = abscisse;
        }

        // Méthode pour afficher les caractéristiques du point
        public void afficher() {
            System.out.println("Point " + nom + " : Abscisse = " + abscisse);
        }

        // Méthode pour effectuer une translation du point
        public void translate(double valeur) {
            abscisse += valeur;
        }
}

package exercice5;
public class TestRectangle {
    public static void main(String[] args) {
        // Test de la classe Rectangle
        Rectangle rectangle1 = new Rectangle(); // Utilisation du constructeur par défaut
        Rectangle rectangle2 = new Rectangle(4.5, 3.0); // Utilisation du constructeur avec longueur et largeur
        Rectangle rectangle3 = new Rectangle(rectangle2); // Utilisation du constructeur avec un objet Rectangle

        // Affichage des rectangles
        afficherRectangle(rectangle1);
        afficherRectangle(rectangle2);
        afficherRectangle(rectangle3);

        // Affichage du périmètre et de l'aire
        System.out.println("\nPérimètre du rectangle2 : " + rectangle2.perimetre());
        System.out.println("Aire du rectangle2 : " + rectangle2.aire());

        // Vérification si le rectangle3 est un carré
        System.out.println("Le rectangle3 est un carré : " + rectangle3.isCarre());
    }

    // Méthode pour afficher un rectangle
    private static void afficherRectangle(Rectangle rectangle) {
        System.out.println(rectangle.toString());
    }
}

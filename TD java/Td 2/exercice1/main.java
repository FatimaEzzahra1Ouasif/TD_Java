package exercice1;

public class main {
    public static void main(String[] args) {
        // Création d'un point avec le nom 'A' et l'abscisse 5.0
        Point pointA = new Point('A', 5.0);

        // Affichage des caractéristiques du point initial
        System.out.println("Avant la translation :");
        pointA.afficher();

        // Translation du point avec une valeur de 3.0
        pointA.translate(3.0);

        // Affichage des caractéristiques du point après la translation
        System.out.println("Après la translation :");
        pointA.afficher();
    }
}
}

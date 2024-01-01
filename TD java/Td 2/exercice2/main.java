package exercice2;

public class main {public static void main(String[] args) {
    // Test de la classe Point
    Point point1 = new Point(); // Utilisation du constructeur par défaut
    Point point2 = new Point(3.0, 4.0); // Utilisation du constructeur d'initialisation

    // Affichage des coordonnées des points
    System.out.println("Coordonnées du point1 : (" + point1.getAbscisse() + ", " + point1.getOrdonnee() + ")");
    System.out.println("Coordonnées du point2 : (" + point2.getAbscisse() + ", " + point2.getOrdonnee() + ")");

    // Calcul et affichage de la norme des points
    System.out.println("Norme du point1 : " + point1.norme());
    System.out.println("Norme du point2 : " + point2.norme());
}
}
}

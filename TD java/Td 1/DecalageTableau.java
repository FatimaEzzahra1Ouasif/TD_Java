public class DecalageTableau {
    public static void main(String[] args) {
        // Tableau initial
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        System.out.println("Tableau initial :");
        afficherTableau(tableau);

        // Effectuer le décalage des éléments du tableau
        deplacerElements(tableau);

        System.out.println("\nTableau modifié :");
        afficherTableau(tableau);
    }

    // Méthode pour effectuer le décalage des éléments du tableau
    public static void deplacerElements(char[] tableau) {
        char premierElement = tableau[0];

        // Décaler les éléments vers la gauche
        for (int i = 0; i < tableau.length - 1; i++) {
            tableau[i] = tableau[i + 1];
        }

        // Placer le premier élément à la fin du tableau
        tableau[tableau.length - 1] = premierElement;
    }

    // Méthode pour afficher le tableau
    public static void afficherTableau(char[] tableau) {
        for (char element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class MaxMinTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille du tableau (N)
        System.out.println("Entrez la taille du tableau (entre 10 et 50) : ");
        int taille = scanner.nextInt();

        // Vérifier que la taille est valide
        if (taille < 10 || taille > 50) {
            System.out.println("La taille du tableau doit être entre 10 et 50.");
        } else {
            // Créer et remplir le tableau T
            int[] tableau = new int[taille];
            for (int i = 0; i < taille; i++) {
                System.out.println("Entrez l'élément " + (i + 1) + " du tableau : ");
                tableau[i] = scanner.nextInt();
            }

            // Calculer et afficher la valeur maximale et minimale
            int valeurMax = trouverValeurMaximale(tableau);
            int valeurMin = trouverValeurMinimale(tableau);

            System.out.println("La valeur maximale du tableau est : " + valeurMax);
            System.out.println("La valeur minimale du tableau est : " + valeurMin);
        }

        scanner.close();
    }

    public static int trouverValeurMaximale(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static int trouverValeurMinimale(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }
}
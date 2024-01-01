import java.util.Scanner;

public class TriangleNumerique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir le nombre de lignes
        System.out.println("Entrez le nombre de lignes pour le triangle : ");
        int nombreDeLignes = scanner.nextInt();

        // Afficher le triangle
        afficherTriangleNumerique(nombreDeLignes);

        scanner.close();
    }

    public static void afficherTriangleNumerique(int n) {
        for (int i = 1; i <= n; i++) {
            // Afficher les chiffres de 1 à i à chaque ligne
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Passer à la ligne après chaque ligne du triangle
            System.out.println();
        }
    }
}

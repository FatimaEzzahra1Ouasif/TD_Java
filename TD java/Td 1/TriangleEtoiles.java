import java.util.Scanner;

public class TriangleEtoiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille du triangle
        System.out.println("Entrez la taille du triangle : ");
        int taille = scanner.nextInt();

        // Afficher le triangle
        afficherTriangleEtoiles(taille);

        scanner.close();
    }

    public static void afficherTriangleEtoiles(int taille) {
        // Afficher la partie supérieure du triangle
        for (int i = 1; i <= taille; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Afficher la partie inférieure du triangle
        for (int i = taille - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

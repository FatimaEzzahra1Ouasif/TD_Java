import java.util.Scanner;

public class OrdreCroissant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir deux variables
        System.out.println("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.println("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        // Appeler la méthode pour afficher les variables dans l'ordre croissant
        afficherVariablesDansOrdreCroissant(a, b);

        scanner.close();
    }

    public static void afficherVariablesDansOrdreCroissant(int a, int b) {
        // Vérifier et échanger les valeurs si nécessaire
        if (a > b) {
            // Échanger les valeurs de a et b
            int temp = a;
            a = b;
            b = temp;
        }

        // Afficher les variables dans l'ordre croissant
        System.out.println("Les variables dans l'ordre croissant sont : " + a + ", " + b);
    }
}

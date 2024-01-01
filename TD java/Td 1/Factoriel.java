import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un entier naturel N
        System.out.println("Entrez un entier naturel N : ");
        int n = scanner.nextInt();

        // Vérifier si l'entier est valide (N >= 0)
        if (n < 0) {
            System.out.println("Veuillez entrer un entier naturel (N >= 0).");
        } else {
            // Calculer et afficher le factoriel
            long factoriel = calculerFactoriel(n);
            System.out.println("Le factoriel de " + n + " est : " + factoriel);
        }

        scanner.close();
    }

    // Méthode pour calculer le factoriel
    public static long calculerFactoriel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultat = 1;
            for (int i = 2; i <= n; i++) {
                resultat *= i;
            }
            return resultat;
        }
    }
}
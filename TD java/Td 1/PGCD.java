import java.util.Scanner;

public class PGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir deux entiers positifs non nuls a et b
        System.out.println("Entrez le premier entier positif non nul (a) : ");
        int a = scanner.nextInt();

        System.out.println("Entrez le deuxième entier positif non nul (b) : ");
        int b = scanner.nextInt();

        // Calculer et afficher le PGCD
        int pgcd = calculerPGCD(a, b);
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);

        scanner.close();
    }

    // Méthode pour calculer le PGCD avec l'algorithme d'Euclide
    public static int calculerPGCD(int a, int b) {
        // Assurer que a et b sont positifs non nuls
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Les nombres doivent être positifs non nuls.");
        }

        // Appliquer l'algorithme d'Euclide
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a; // a contient le PGCD
    }
}

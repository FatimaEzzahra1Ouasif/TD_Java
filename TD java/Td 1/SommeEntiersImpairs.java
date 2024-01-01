import java.util.Scanner;

public class SommeEntiersImpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un entier N
        System.out.println("Entrez un entier N : ");
        int n = scanner.nextInt();

        // Vérifier si l'entier est valide (N >= 0)
        if (n < 0) {
            System.out.println("Veuillez entrer un entier positif (N >= 0).");
        } else {
            // Calculer et afficher la somme des entiers impairs inférieurs à N
            int somme = calculerSommeEntiersImpairs(n);
            System.out.println("La somme des entiers impairs inférieurs à " + n + " est : " + somme);
        }

        scanner.close();
    }

    // Méthode pour calculer la somme des entiers impairs inférieurs à N
    public static int calculerSommeEntiersImpairs(int n) {
        int somme = 0;
        for (int i = 1; i < n; i += 2) {
            somme += i;
        }
        return somme;
    }
}
import java.util.Scanner;

public class PermutationsEntier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un entier de trois chiffres non nuls
        System.out.println("Entrez un entier de trois chiffres non nuls : ");
        int entier = scanner.nextInt();

        // Vérifier que l'entier a trois chiffres non nuls
        if (estEntierTroisChiffresNonNuls(entier)) {
            afficherPermutations(entier);
        } else {
            System.out.println("L'entier doit avoir trois chiffres non nuls.");
        }

        scanner.close();
    }

    // Vérifier si l'entier a trois chiffres non nuls
    public static boolean estEntierTroisChiffresNonNuls(int n) {
        return n >= 100 && n <= 999 && (n % 100) != 0;
    }

    // Afficher toutes les permutations des chiffres de l'entier
    public static void afficherPermutations(int n) {
        int centaines = n / 100;
        int dizaines = (n % 100) / 10;
        int unites = n % 10;

        System.out.println("Les nombres formés par les chiffres de " + n + " sont :");

        // Afficher les permutations
        System.out.println(centaines * 100 + dizaines * 10 + unites);
        System.out.println(centaines * 100 + unites * 10 + dizaines);
        System.out.println(dizaines * 10 + centaines * 100 + unites);
        System.out.println(dizaines * 10 + unites * 100 + centaines);
        System.out.println(unites * 100 + centaines * 10 + dizaines);
        System.out.println(unites * 100 + dizaines * 10 + centaines);
    }
}
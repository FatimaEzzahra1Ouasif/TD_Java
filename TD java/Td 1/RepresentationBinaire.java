import java.util.Scanner;

public class RepresentationBinaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un entier N
        System.out.println("Entrez un entier N : ");
        int n = scanner.nextInt();

        // Afficher la représentation binaire de N
        String representationBinaire = convertirEnBinaire(n);
        System.out.println("La représentation binaire de " + n + " est : " + representationBinaire);

        scanner.close();
    }

    // Méthode pour convertir un entier en sa représentation binaire
    public static String convertirEnBinaire(int n) {
        StringBuilder binaire = new StringBuilder();

        if (n == 0) {
            binaire.append("0");
        } else {
            while (n > 0) {
                int bit = n % 2;
                binaire.insert(0, bit); // Ajouter le bit au début de la chaîne
                n /= 2;
            }
        }

        return binaire.toString();
    }
}

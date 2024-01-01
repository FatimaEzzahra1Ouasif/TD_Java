import java.util.Scanner;

public class NombreDeJoursMois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir le numéro du mois
        System.out.println("Entrez le numéro du mois (1-12) : ");
        int mois = scanner.nextInt();

        // Vérifier si le mois est valide
        if (mois >= 1 && mois <= 12) {
            // Pour février, saisir l'année et vérifier si elle est bissextile
            if (mois == 2) {
                System.out.println("Entrez l'année (1900-2100) : ");
                int annee = scanner.nextInt();

                if (estAnneeBissextile(annee)) {
                    System.out.println("Le mois de février a 29 jours.");
                } else {
                    System.out.println("Le mois de février a 28 jours.");
                }
            } else {
                // Pour les autres mois, utiliser un tableau pour stocker le nombre de jours
                int[] joursParMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                int jours = joursParMois[mois - 1];
                System.out.println("Le mois " + mois + " a " + jours + " jours.");
            }
        } else {
            System.out.println("Numéro de mois invalide.");
        }

        scanner.close();
    }

    // Vérifier si une année est bissextile
    public static boolean estAnneeBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
}

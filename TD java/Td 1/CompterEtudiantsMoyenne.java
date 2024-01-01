import java.util.Scanner;

public class CompterEtudiantsMoyenne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille du tableau
        System.out.println("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();

        // Créer le tableau des moyennes
        double[] moyennes = new double[nombreEtudiants];

        // Saisir les moyennes des étudiants
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.println("Entrez la moyenne de l'étudiant #" + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Saisir le seuil
        System.out.println("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        // Compter et afficher le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
        int nombreEtudiantsSupSeuil = compterEtudiantsSupSeuil(moyennes, seuil);
        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : "
                + nombreEtudiantsSupSeuil);

        scanner.close();
    }

    // Méthode pour compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
    public static int compterEtudiantsSupSeuil(double[] moyennes, double seuil) {
        int count = 0;
        for (double moyenne : moyennes) {
            if (moyenne >= seuil) {
                count++;
            }
        }
        return count;
    }
}

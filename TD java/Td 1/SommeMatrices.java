import java.util.Scanner;

public class SommeMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille des matrices carrées
        System.out.println("Entrez la taille des matrices carrées (nombre de lignes/colonnes) : ");
        int taille = scanner.nextInt();

        // Saisir la première matrice
        System.out.println("Saisie de la première matrice :");
        double[][] matrice1 = saisirMatrice(taille);

        // Saisir la deuxième matrice
        System.out.println("Saisie de la deuxième matrice :");
        double[][] matrice2 = saisirMatrice(taille);

        // Calculer la somme des matrices
        double[][] sommeMatrices = calculerSommeMatrices(matrice1, matrice2);

        // Afficher la somme des matrices
        System.out.println("La somme des matrices est :");
        afficherMatrice(sommeMatrices);

        scanner.close();
    }

    // Méthode pour saisir une matrice
    public static double[][] saisirMatrice(int taille) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrice = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez l'élément à la position [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }

    // Méthode pour calculer la somme des matrices
    public static double[][] calculerSommeMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] sommeMatrices = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return sommeMatrices;
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(double[][] matrice) {
        int taille = matrice.length;

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


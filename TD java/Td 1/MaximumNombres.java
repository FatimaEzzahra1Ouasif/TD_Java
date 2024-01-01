import java.util.Scanner;

public class MaximumNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Partie 1
        int[] nombres = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Entrez le nombre #" + (i + 1) + " : ");
            nombres[i] = scanner.nextInt();
        }

        int maximum = trouverMaximum(nombres);
        System.out.println("Le maximum des 20 nombres est : " + maximum);

        // Partie 2
        int positionMaximum = trouverPositionMaximum(nombres);
        System.out.println("Le maximum a été saisi en position : " + positionMaximum);

        // Partie 3
        System.out.println("Entrez une suite de nombres (terminez par 0) : ");
        int nombre = scanner.nextInt();
        int maximumSuite = nombre;

        while (nombre != 0) {
            if (nombre > maximumSuite) {
                maximumSuite = nombre;
            }
            nombre = scanner.nextInt();
        }

        System.out.println("Le maximum de la suite est : " + maximumSuite);

        scanner.close();
    }

    public static int trouverMaximum(int[] tableau) {
        int maximum = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }
        return maximum;
    }

    public static int trouverPositionMaximum(int[] tableau) {
        int maximum = tableau[0];
        int positionMaximum = 0;

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];
                positionMaximum = i;
            }
        }
        return positionMaximum + 1; // Ajouter 1 car les positions commencent à 1, pas à 0
    }
}
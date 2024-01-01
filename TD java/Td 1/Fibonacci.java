import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un entier positif n
        System.out.println("Entrez un entier positif n : ");
        int n = scanner.nextInt();

        // Vérifier si l'entier est valide (n >= 0)
        if (n < 0) {
            System.out.println("Veuillez entrer un entier positif.");
        } else {
            // Calculer et afficher le nème terme de la suite de Fibonacci
            long terme = calculerFibonacci(n);
            System.out.println("Le " + n + "-ème terme de la suite de Fibonacci est : " + terme);
        }

        scanner.close();
    }

    // Méthode pour calculer le nème terme de la suite de Fibonacci
    public static long calculerFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long termePrecedent = 0;
            long termeCourant = 1;

            for (int i = 2; i <= n; i++) {
                long temp = termeCourant;
                termeCourant = termeCourant + termePrecedent;
                termePrecedent = temp;
            }

            return termeCourant;
        }
    }
}

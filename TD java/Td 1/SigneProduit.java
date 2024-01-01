import java.util.Scanner;

public class SigneProduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de A : ");
        int a = scanner.nextInt();

        System.out.println("Entrez la valeur de B : ");
        int b = scanner.nextInt();

        determinerSigneProduit(a, b);

        scanner.close();
    }

    public static void determinerSigneProduit(int a, int b) {
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Le signe du produit A * B est positif.");
        } else if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            System.out.println("Le signe du produit A * B est négatif.");
        } else {
            System.out.println("Le produit A * B est zéro.");
        }
    }
}
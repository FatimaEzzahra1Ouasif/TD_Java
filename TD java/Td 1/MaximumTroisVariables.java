import java.util.Scanner;

public class MaximumTroisVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.println("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        System.out.println("Entrez la troisième variable : ");
        int c = scanner.nextInt();

        int maximum = trouverMaximum(a, b, c);
        System.out.println("Le maximum des trois variables est : " + maximum);

        scanner.close();
    }

    public static int trouverMaximum(int a, int b, int c) {
        int maxTemp = (a > b) ? a : b;
        return (maxTemp > c) ? maxTemp : c;
    }
}

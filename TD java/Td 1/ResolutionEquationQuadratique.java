import java.util.Scanner;

public class ResolutionEquationQuadratique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.println("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.println("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        resoudreEquationQuadratique(a, b, c);

        scanner.close();
    }

    public static void resoudreEquationQuadratique(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux racines réelles distinctes :");
            System.out.println("Racine 1 = " + racine1);
            System.out.println("Racine 2 = " + racine2);
        } else if (discriminant == 0) {
            double racine = -b / (2 * a);
            System.out.println("Une racine réelle unique :");
            System.out.println("Racine = " + racine);
        } else {
            System.out.println("Pas de racines réelles, les racines sont complexes :");
            double partieReelle = -b / (2 * a);
            double partieImaginaire = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Racine 1 = " + partieReelle + " + " + partieImaginaire + "i");
            System.out.println("Racine 2 = " + partieReelle + " - " + partieImaginaire + "i");
        }
    }
}

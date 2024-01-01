import java.util.Scanner;

public class SommeChiffres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un nombre entier
        System.out.println("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        // Calculer et afficher la somme des chiffres
        int somme = calculerSommeChiffres(nombre);
        System.out.println("La somme des chiffres de " + nombre + " est : " + somme);

        scanner.close();
    }

    // Méthode pour calculer la somme des chiffres d'un nombre
    public static int calculerSommeChiffres(int n) {
        int somme = 0;

        // Utiliser une boucle pour additionner chaque chiffre
        while (n != 0) {
            somme += n % 10; // Ajouter le dernier chiffre à la somme
            n /= 10; // Supprimer le dernier chiffre du nombre
        }

        return somme;
    }
}

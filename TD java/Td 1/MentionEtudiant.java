import java.util.Scanner;

public class MentionEtudiant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        determinerMention(moyenne);

        scanner.close();
    }

    public static void determinerMention(double moyenne) {
        if (moyenne >= 16) {
            System.out.println("Mention : Très Bien");
        } else if (moyenne >= 14) {
            System.out.println("Mention : Bien");
        } else if (moyenne >= 12) {
            System.out.println("Mention : Assez Bien");
        } else if (moyenne >= 10) {
            System.out.println("Mention : Passable");
        } else {
            System.out.println("Mention : Non admis");
        }
    }
}

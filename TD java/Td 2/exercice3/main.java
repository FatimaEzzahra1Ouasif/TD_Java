package exercice3;

public class MainLivre {
    public static void main(String[] args) {
        // Test de la classe Livre
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Titre1");
        Livre livre3 = new Livre("Titre2", "Auteur1");
        Livre livre4 = new Livre("Titre3", "Auteur2", 29.99);
        Livre livre5 = new Livre("Titre4", "Auteur3", 19.99, 2022);
        Livre livre6 = new Livre(livre5);

        // Affichage des livres
        afficherLivre(livre1);
        afficherLivre(livre2);
        afficherLivre(livre3);
        afficherLivre(livre4);
        afficherLivre(livre5);
        afficherLivre(livre6);
    }

    // Méthode pour afficher un livre
    private static void afficherLivre(Livre livre) {
        System.out.println(livre.toString());
    }
}


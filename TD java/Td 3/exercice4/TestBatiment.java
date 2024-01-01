package exercice4;
public class TestBatiment {
    public static void main(String[] args) {
        // Test des classes Batiment, Maison et Immeuble
        Batiment batiment = new Batiment("1, Rue de la Ville");
        Maison maison = new Maison("2, Avenue Principale", 3);
        Immeuble immeuble = new Immeuble("3, Rue Commerciale", 10);

        // Affichage des informations
        System.out.println(batiment);
        System.out.println(maison);
        System.out.println(immeuble);
    }
}

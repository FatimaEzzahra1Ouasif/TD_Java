package exercice1;
public class TestCentreCercle {
    public static void main(String[] args) {
        // Utilisation de la classe Centre
        Centre centre = new Centre(2, 3, 'A');
        centre.affiche();

        // Utilisation de la classe Cercle
        Cercle cercle = new Cercle(5, 7, 'B', 3.0);
        cercle.affiche();
        System.out.println("Aire du cercle : " + cercle.calculerAire());
    }
}


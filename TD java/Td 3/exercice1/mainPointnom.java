package exercice1;
public class TestPointNom {
    public static void main(String[] args) {
        // Utilisation de la classe PointNom
        PointNom pointNom = new PointNom(2, 3, 'A');
        pointNom.affCoordNom();

        // Modification des coordonnées et du nom
        pointNom.setPointNom(5, 7, 'B');
        pointNom.affCoordNom();

        // Modification seulement du nom
        pointNom.setNom('C');
        pointNom.affCoordNom();
    }
}

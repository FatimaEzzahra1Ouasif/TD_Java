package exercice1;
public class TestPoint {
    public static void main(String[] args) {
        // Utilisation de la classe Point
        Point point = new Point(2, 3);
        point.deplace(1, -1);
        System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");

        // Utilisation de la classe PointA
        PointA pointA = new PointA(5, 7);
        pointA.deplace(2, 2);
        pointA.affiche();
    }
}

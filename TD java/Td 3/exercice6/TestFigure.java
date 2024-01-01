package exercice6;
class TestFigure {
    public static void main(String[] args) {
        // Test des classes Figure, Disque et Rectangle
        Disque disque = new Disque(new Point(2, 3), 5.0, "Mon Disque");
        System.out.println(disque);
        System.out.println("Perimeter: " + disque.getPerimeter());
        System.out.println("Aire: " + disque.getAire());

        Rectangle rectangle = new Rectangle(4.0, 6.0, "Mon Rectangle");
        System.out.println(rectangle);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Aire: " + rectangle.getAire());
    }
}

package exercice8;
public class TestEmploye {
    public static void main(String[] args) {
        // Test des interfaces Employe, Patron, TravailleurCommission et TravailleurHoraire
        Employe patron = new Patron("Dupont", "Jean", 5000.0);
        System.out.println(patron);
        System.out.println("Gains: " + patron.gains());

        Employe travailleurCommission = new TravailleurCommission("Martin", "Alice", 2000.0, 2.5);
        ((TravailleurCommission) travailleurCommission).setQuantite(100);
        System.out.println(travailleurCommission);
        System.out.println("Gains: " + travailleurCommission.gains());

        Employe travailleurHoraire = new TravailleurHoraire("Leclerc", "Paul", 15.0);
        ((TravailleurHoraire) travailleurHoraire).setHeures(40);
        System.out.println(travailleurHoraire);
        System.out.println("Gains: " + travailleurHoraire.gains());
    }
}

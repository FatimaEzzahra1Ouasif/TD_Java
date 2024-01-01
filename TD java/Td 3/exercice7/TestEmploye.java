package exercice7;
class TestEmploye {
    public static void main(String[] args) {
        // Test des classes Employe, Patron, TravailleurCommission et TravailleurHoraire
        Patron patron = new Patron("Dupont", "Jean", 5000.0);
        System.out.println(patron);
        System.out.println("Gains: " + patron.gains());

        TravailleurCommission travailleurCommission = new TravailleurCommission("Martin", "Alice", 2000.0, 2.5);
        travailleurCommission.setQuantite(100);
        System.out.println(travailleurCommission);
        System.out.println("Gains: " + travailleurCommission.gains());

        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Leclerc", "Paul", 15.0);
        travailleurHoraire.setHeures(40);
        System.out.println(travailleurHoraire);
        System.out.println("Gains: " + travailleurHoraire.gains());
    }
}
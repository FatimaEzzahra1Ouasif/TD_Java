package exercice4;
public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    // Constructeurs
    public Temps() {
        this.heures = 0;
        this.minutes = 0;
        this.secondes = 0;
    }

    public Temps(int heures) {
        this.heures = heures;
        this.minutes = 0;
        this.secondes = 0;
    }

    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = 0;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public Temps(Temps autreTemps) {
        this.heures = autreTemps.heures;
        this.minutes = autreTemps.minutes;
        this.secondes = autreTemps.secondes;
    }

    // Accesseurs et mutateurs
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures >= 0 && heures <= 23) {
            this.heures = heures;
        } else {
            System.out.println("Heures invalides. La valeur doit être entre 0 et 23.");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Minutes invalides. La valeur doit être entre 0 et 59.");
        }
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            System.out.println("Secondes invalides. La valeur doit être entre 0 et 59.");
        }
    }

    // Méthodes
    public void ajouterHeures(int heures) {
        this.heures = (this.heures + heures) % 24;
    }

    public void ajouterMinutes(int minutes) {
        int totalMinutes = this.heures * 60 + this.minutes + minutes;
        this.heures = (totalMinutes / 60) % 24;
        this.minutes = totalMinutes % 60;
    }

    public void ajouterSecondes(int secondes) {
        int totalSecondes = this.heures * 3600 + this.minutes * 60 + this.secondes + secondes;
        this.heures = (totalSecondes / 3600) % 24;
        this.minutes = (totalSecondes / 60) % 60;
        this.secondes = totalSecondes % 60;
    }

    // Méthode toString
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}

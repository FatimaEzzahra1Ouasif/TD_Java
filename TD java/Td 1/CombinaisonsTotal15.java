public class CombinaisonsTotal15 {
    public static void main(String[] args) {
        int totalDesire = 15;

        System.out.println("Combinaisons pour obtenir un total de " + totalDesire + " :");

        // Boucle pour les trois entiers de 1 à 9
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i + j + k == totalDesire) {
                        System.out.println(i + " + " + j + " + " + k + " = " + totalDesire);
                    }
                }
            }
        }
    }
}

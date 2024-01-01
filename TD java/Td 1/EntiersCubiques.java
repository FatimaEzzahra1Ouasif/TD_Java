public class EntiersCubiques {
    public static void main(String[] args) {
        System.out.println("Entiers cubiques de trois chiffres :");
        chercherEntiersCubiques();
    }

    public static void chercherEntiersCubiques() {
        for (int i = 100; i <= 999; i++) {
            if (estCubique(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean estCubique(int n) {
        int original = n;
        int sommeCubes = 0;

        while (n > 0) {
            int chiffre = n % 10;
            sommeCubes += chiffre * chiffre * chiffre;
            n /= 10;
        }

        return sommeCubes == original;
    }
}

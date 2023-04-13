package Kanvica;

import java.util.Scanner;

public class Kanvica {

    public static int mnozstvoVody;
    public static boolean zapnut;
    public static int teplotaVody = 25;
    public static final int bodVaru = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        zapniMa();

        System.out.println("Zadaj aké je množstvo vody v nádržke prosím!");

        mnozstvoVody = scanner.nextInt();

        voda();
        budemVriet();
        vriem();

        System.out.println("Voda je pripravená!");


        vypniMa();
    }

    public static void zapniMa() {
        System.out.println("Zapínam sa");
        zapnut = true;
    }

    public static void vypniMa() {
        System.out.println("Vypínam sa");
        zapnut = false;
    }

    public static void voda() {
        if (mnozstvoVody < 150) {
            System.out.println("Dolej prosím vodu");
        } else {
            System.out.println("Množstvo vody je dostatočné");
        }
    }

    public static void budemVriet() {
        if (teplotaVody < bodVaru) {
            System.out.println("Zohrievam vodu");
            teplotaVody = bodVaru;
        } else {
            System.out.println("Vriem");
        }
    }

    public static void vriem() {
        if (teplotaVody < 100) {
            System.out.println("Zohrievam vodu");
            teplotaVody = bodVaru;
        } else {
            System.out.println("Vriem");
        }

    }
}

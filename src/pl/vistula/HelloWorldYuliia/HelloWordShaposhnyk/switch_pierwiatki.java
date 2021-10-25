package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.util.Scanner;

public class switch_pierwiatki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz zmienną A: ");
        double zmiennaA = scanner.nextDouble();

        System.out.println("Wpisz zmienną B: ");
        double zmiennaB = scanner.nextDouble();

        System.out.println("Wpisz zmienną C: ");
        double zmiennaC = scanner.nextDouble();

        double delta = zmiennaB * zmiennaB - 4 * zmiennaA * zmiennaC;
        System.out.println(delta);

        double x1, x2;
        x1 = (-zmiennaB - Math.sqrt(delta)) / (2 * zmiennaA);
        x2 = (-zmiennaB + Math.sqrt(delta)) / (2 * zmiennaA);

        System.out.println(x1);
        System.out.println(x2);

        int choice;
        System.out.println("\nCo chcesz zrobić z wprowadzonymi numerami?" +
                "\n(1) " + "Oblicz dyskryminant\n" +
                "(2) Oblicz wartości\n" +
                "(3) Znajdź naturę korzeni\n" +
                "(4) Wszystkie powyższe");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\nDyskryminant: " + delta);
                break;
            case 2:
                System.out.println("\nWartości są: " + x1 + ", " + x2);
                break;
            case 3:
                if (delta > 0) {
                    System.out.println("\nKorzenie są PRAWDZIWE i WYRÓŻNIANE");
                } else if (delta == 0) {
                    System.out.println("\nKorzenie są PRAWDZIWE i RÓWNE");
                } else {
                    System.out.println("\nKorzenie są WYOBRAŻONE");
                }
                break;
            case 4:
                System.out.println("\nDyskryminant: " + delta);
                System.out.println("\nWartości są: " + x1 + ", " + x2);
                if (delta > 0) {
                    System.out.println("\nKorzenie są PRAWDZIWE i WYRÓŻNIANE");
                } else if (delta == 0) {
                    System.out.println("\nKorzenie są PRAWDZIWE i RÓWNE");
                } else {
                    System.out.println("\nKorzenie są WYOBRAŻONE");
                }
                break;

        }
    }
}


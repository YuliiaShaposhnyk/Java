package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        int ilosc[] = new int[10];
        int i;
        float min, max, liczba, suma = 0;

        Random r = new Random();
        min = Math.round(100*(r.nextDouble()));
        System.out.print("Wylosowano liczby: " + min + ", ");
        max=min;
        suma = suma+max;
        for (i = 0; i < 10; i++)
        {
            liczba = Math.round(100*(r.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) max = liczba;
            if (liczba < min) min = liczba;

            suma = suma+liczba;
        }
        System.out.println();
        System.out.println("największa liczba to " + max + ",");
        System.out.println("najmniejsza liczba to " + min + ",");
    }
}

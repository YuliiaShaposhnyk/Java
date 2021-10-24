package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.math.BigDecimal;
import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Prosze wpisz swoj wzrost: ");
        float heightYuliia = in.nextFloat()/100;

        System.out.println("Prosze wpisz wage : ");
        float weightYuliia = in.nextFloat();

        float height = (float)Math.pow(heightYuliia, 2);

        double sum = weightYuliia / height;

        BigDecimal a = new BigDecimal(sum);
        System.out.println("Summa = " + a.setScale(2,BigDecimal.ROUND_CEILING));


        if(sum < 16){
            System.out.println("Wygłodzenie");
        }else if (sum <= 16.99){
            System.out.println("Wychudzenie");
        }else if (sum <= 18.49){
            System.out.println("Niedowaga");
        } else if (sum <= 22.99){
            System.out.println("Norma niski przedział");
        } else if (sum <= 24.99){
            System.out.println("Norma wysoki przedział");
        } else if (sum <= 27.49){
            System.out.println("Nadwaga niski przedział");
        } else if (sum <= 29.99){
            System.out.println("Nadwaga wysoki przedział");
        }else if (sum <= 34.9){
            System.out.println("Otyłość I stopnia");
        }else if (sum <= 39.9){
            System.out.println("Otyłość II stopnia");
        }else if (sum < 40){
            System.out.println("otyłość III stopnia");
        }
    }
}
/*
        Proszę o stworzenie programu, który obliczy wskaźnik BMI (z
        achęcam do wykorzystania metody Math.pow ()()) po
        podaniu przez użytkownika jego wzrostu oraz wagi (przykładowe nazwy zmiennych: height Bielecki , weightBielecki
        Zmienne pobrane przez użytkownika przypisujemy do typu
        float . Po obliczaniu wskaźnika, dzięki instrukcji if else if
        wartość zostanie przypisana do właściwego przedziału oraz na konsoli pojawi się właściwa informacja.
*/
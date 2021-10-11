package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.util.LinkedList;
import java.util.Random;

public class HelloWorldShaposhnyk{

    public static void main(String[] args) {
        //zadanie 2
    /*    float mojaWaga = 50.7F;
        float grawitacjaMarca = 0.38F;

        double marsWeightBilecki = mojaWaga * grawitacjaMarca;

        String result = String.format("%.2f",marsWeightBilecki );
        System.out.print(result);

        int rzutowanie = (int)marsWeightBilecki;
        System.out.print(rzutowanie);

        char zadanie3 = Integer.toString(rzutowanie).charAt(0);;
        System.out.print(zadanie3);

        // zadanie 3

        int randomN = (int)(Math.random() * 100-1);

        if (randomN %2 == 0){
            System.out.println( randomN + "Liczba jest parzysta");
        }else {
            System.out.println( randomN + "Liczba jest nie parzysta");
        }
*/

        // zadanie 4

        double cenaNetto = 9.99;
        double vat = 0.23;

        double cenaSprzedaży = cenaNetto * vat;
        double sprzedaż = cenaSprzedaży * cenaNetto;
        System.out.println("Cena jednego produktu z vat "+cenaSprzedaży);

        double cena = sprzedaż * 10000;
        System.out.println("Cena 10 000 produktu z vat "+cena);










    }

}






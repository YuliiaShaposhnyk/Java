package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.util.Scanner;

public class ile_ważysz_na_marsie {

    public static void main(String[] args) {
        float mojaWaga = 60.0F;
        float grawitacjaMarsa = 0.38F;

        double marsWeight = mojaWaga * grawitacjaMarsa;

        String result = String.format("%.2f",marsWeight );
        System.out.print(result);

        int rzutowanie = (int)marsWeight;
        System.out.print(rzutowanie);

        char zadanie3 = Integer.toString(rzutowanie).charAt(0);;
        System.out.print(zadanie3);
    }

}

/*
        Grawitacja Marsa stanowi około 38% ziemskiej. Napisz program, który obliczy Twój ciężar na Marsie.
        Założenie:
                -wszystkie zmienne zadeklaruj na górze klasy,
                -wszystkie zmienne oprócz nazwy zgodnej z zasadami „ clean code ” powinny zawierać również  Twoje nazwisko, np.: float marsWeightBielecki
                -początkowe zmienne mają być typu float
                -po dokonaniu obliczeń dokonaj przypisania wyniku do nowej zmiennej tym razem typu double
                -po wykonaniu przypisania wypisz na konsole zmienną double ograniczając jej długość do 4 miejsc po przecinku,
                -dokonaj rzutowania powyższej zmiennej typu double na nową zmienną typu int
                -dokonaj rzutowania powyższej zmiennej typu int na nową zmienną typu char,
                -wykonaj jakieś działanie matematyczne na tej zmiennej char i przypisz wartość tego działania do nowej zmiennej typu int .
        Każde z powyższych działań wypisz na konsole, dodając przy tym jakiś tekst tłumaczący co zostało zrobione.*/
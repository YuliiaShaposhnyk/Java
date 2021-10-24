package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prosty_kalkulator {
    public static void main(String[] args) throws IOException {
        float firstNumber, secondNumber, sum, substraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza sumę, roznicę, iloczyn i iloraz dla dwoch liczb");
        System.out.println("Podaj pierwsza liczbę (oraz wcisnij Enter): ");
        firstNumber = Float.parseFloat(br.readLine());
        System.out.println("Podaj druga liczbe (oraz wcisnij Enter): ");
        secondNumber = Float.parseFloat(br.readLine());

        sum = firstNumber + secondNumber;
        substraction = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;

        System.out.printf("Wprowadzilas dwie liczby, pierwsze to: " + "%2.2f", firstNumber);
        System.out.printf("a druga to: " + "%2.2f", secondNumber);

        System.out.println("" );

        System.out.printf("Suma = " + "%2.2f , \n", + sum);
        System.out.printf("Rożnica = " + "%2.2f , \n", + substraction);
        System.out.printf("Iloczyn = " + "%2.2f , \n", + product);
        System.out.printf("Podział = " + "%2.2f , \n", + quotient);
    }
}

/*
        Proszę o stworzenie programu, który obliczy sumę, różnicę, iloczyn oraz
        iloraz dla dwóch liczb wprowadzonych przez użytkownika (przykładowe
        nazwy zmiennych: firstNumberBielecki , second NumberBielecki
        Zmienne pobrane od użytkownika proszę przypisać do typu
        float
        Wszystkie obliczenie (suma, różnica, iloczy
        n oraz iloraz) wykonują się od
        razu (użytkownik nie wybiera działania jakie ma się wykonać), wynik
        obliczeń ma przyjąć format wyświetlenia do dwóch miejsc po przecinku.
 */

package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.io.BufferedReader;
import java.util.Scanner;

public class dzidizenie {

    static class Kadra extends Osoba{
        String wyksztalcenie, stanowisko;
        void inicjuj(){
            inicjuj1();
            Scanner kadr = new Scanner(System.in);
            System.out.println("Wyksztalcenie: ");
            wyksztalcenie = kadr.nextLine();
            System.out.println("Stanowisko: ");
            stanowisko = kadr.nextLine();
        }
        void drukuj(){
            drukuj1();
            System.out.println(" Stanowisko: " + this.stanowisko);
            System.out.println(" Wyksztalcenie: " + this.wyksztalcenie);
        }
    }

    static class Osoba {
        String name, nazwisko, ulica, miasto, kod;

        void inicjuj1(){
            Scanner people = new Scanner(System.in);
            System.out.println("Imię: ");
            name = people.nextLine();
            System.out.println("Nazwisko: ");
            nazwisko = people.nextLine();
            System.out.println("Miasto: ");
            miasto = people.nextLine();
            System.out.println("Ulica: ");
            ulica = people.nextLine();
            System.out.println("Kod: ");
            kod = people.nextLine();

        }

        void drukuj1(){
            System.out.println("Imię:" + this.name);
            System.out.println("Nazwisko:" + this.nazwisko);
            System.out.println("Miasto:" + this.miasto);
            System.out.println("Ulica:" + this.ulica);
            System.out.println("Kod:" + this.kod);
        }

    }

    public static void main(String[] args) {
        Osoba osoba1 = new Osoba();
        osoba1.inicjuj1();
        osoba1.drukuj1();

        Kadra kadra1 = new Kadra();
        kadra1.inicjuj();
        kadra1.drukuj();


    }



}

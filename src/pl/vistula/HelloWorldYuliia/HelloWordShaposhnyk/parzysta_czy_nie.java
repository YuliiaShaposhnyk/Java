package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class parzysta_czy_nie {
    public static void main(String[] args) {
        int randomN = (int)(Math.random() * 100-1);

        if (randomN %2 == 0){
            System.out.println( randomN + " Liczba jest parzysta");
        }else {
            System.out.println( randomN + " Liczba jest nie parzysta");
        }
    }
}
/*
    Napisz program który generuje losową liczbę z przedziału od 1 do 100
    (możesz użyć metody Random z klasy Mat h , a w następnym kroku
    sprawdza (dzięki modulo) czy jest to liczba parzysta czy nieparzysta.
    Każde z powyższych działań wypisz na konsole, dodając przy tym jakiś
    tekst tłumaczący co zostało zrobione.
    /
 */
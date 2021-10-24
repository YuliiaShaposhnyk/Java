package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class pojemniki_na_klocki {
    public static void main(String[] args) {
        int amuntOfShaposhnyk = 79;
        int containerCapacity = 8;

        int pojemniki = amuntOfShaposhnyk / containerCapacity;
        System.out.println("Tyle pojemników jest pewny = " + pojemniki);

        int ileZostaloKlockow = amuntOfShaposhnyk % containerCapacity;
        System.out.println("Zostało tyle klocków = " + ileZostaloKlockow);

    }
}
/*
        Wybierz liczba nieparzystą z przedziału od 50
        do 100, i zapisz ją jako jako
        zmienną int mówiąca nam ile klocków Lego posiadamy (np.
        amuntOfBricks ), następnie wybierz liczbę parzystą z przedziału od 5 do 10
        stwierdzającą ile klocków Lego mieści się w jednym pojemniku (
        containerCapacity ) i zapisz ją również jako zmienną int
        Napisz program który obliczy ile mamy pełnych pojemników, a ile
        pojemników w ogóle i ile klocków jest w pojemniku który nie został
        zapełniony w całości (użyj do tego operatora % czyli modulo).
        Każde
        z powyższych działań wypisz na konsole, dodając przy tym jakiś
        tekst tłumaczący co zostało zrobione.
 */
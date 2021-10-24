package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

import java.math.BigDecimal;

public class podatki_w_java {
    public static void main(String[] args) {

        double cenaNetto = 9.99;
        double vat = 0.23;

        System.out.println("Cena jednego produktu bez vat = " + cenaNetto);

        double cenaSprzedaży = (cenaNetto * vat) + cenaNetto;
        System.out.println("Cena jednego produktu z vat "+ cenaSprzedaży);

        double netto = cenaNetto * 10000;
        System.out.println("Cena 10 000 produktu bez vat "+ netto);

        double cena = cenaSprzedaży * 10000;
        System.out.println("Cena 10 000 produktu z vat "+ cena);


        System.out.println("Ten sam rezultat tylko przy wykorzystaniu class BigDecimal: ");

        BigDecimal a = new BigDecimal(cenaSprzedaży);
        System.out.println("Cena jednego produktu z vat " + a.setScale(1,BigDecimal.ROUND_CEILING));


        BigDecimal b = new BigDecimal(netto);
        System.out.println( "Cena 10 000 produktu bez vat "+ b.setScale(1,BigDecimal.ROUND_CEILING));

        BigDecimal c = new BigDecimal(cena);
        System.out.println( "Cena 10 000 produktu z vat "+ c.setScale(1,BigDecimal.ROUND_CEILING));

    }


}

/*
        Załóżmy że jakiś produkt kosztuje 9.99 netto, oblicz jego wartość brutto
        (zakładamy VAT 23%). Następnie pomnóż ją przez 10000 (czyli np.
        sprzedaliśmy 10000 szt tego produktu), i oblicz tę wartość bez VAT.
        ---------------------------------------------------------------------------------------------------
        Zaimplementuj
        powyższe działania używając klasy Big Decimal Wypisz
        na konsole wszystkie wyliczane wartości, porównaj ich wartości, jakie
        wnioski?
*/

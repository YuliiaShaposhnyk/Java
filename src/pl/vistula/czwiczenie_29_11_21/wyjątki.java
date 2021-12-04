package pl.vistula.czwiczenie_29_11_21;

public class wyjątki {
    public static void main(String[] args) {
        Telefon komorka = null;
        try {
            komorka.getNumber();

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Przetworzono wyjątek. ");
        }
    }
    public class Telefon{
        private int number;
        public int getNumber() {
            return number;
        }
        public void setName(String name) {
            this.number = number;
        }
    }
}

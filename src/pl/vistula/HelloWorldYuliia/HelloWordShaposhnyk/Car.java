package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class Car {
    public static void main(String[] args) {
        Cars car1 = new Cars("BMW", "red", "s-02", 270000, 15);

        System.out.println(car1.toString());

        car1.sell(2);
        System.out.println(car1.getIlosc());

        car1.setCena(30000);
        System.out.println("Cena" + car1.getCena());

        System.out.println(car1.toString());
    }
}
 class Cars{
    private String model, color, marka;
    private int cena, ilosc;

     public Cars(String model, String color, String marka, int cena, int ilosc) {
         this.model = model;
         this.color = color;
         this.marka = marka;
         this.cena = cena;
         this.ilosc = ilosc;
     }

     public void delivery( int n ){
         ilosc += n;
     }

     public void sell (int n ){
         ilosc -= n;
     }

     public String getModel() {
         return model;
     }

     public String getColor() {
         return color;
     }

     public String getMarka() {
         return marka;
     }

     public int getCena() {
         return cena;
     }

     public int getIlosc() {
         return ilosc;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public void setMarka(String marka) {
         this.marka = marka;
     }

     public void setCena(int cena) {
         this.cena = cena;
     }

     public void setIlosc(int ilosc) {
         this.ilosc = ilosc;
     }

     @Override
     public String toString() {
         return "Cars{" +
                 "model='" + model + '\'' +
                 ", color='" + color + '\'' +
                 ", marka='" + marka + '\'' +
                 ", cena=" + cena +
                 ", ilosc=" + ilosc +
                 '}';
     }
 }
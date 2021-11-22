package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class TablicaDemo {
    public static void main(String[] args) {

        int elements[] = new int [10];

        for ( int i = 0; i < elements.length; i++){
            elements[i] = elements.length - 1 - i;
       }
        System.out.println();
    }

}

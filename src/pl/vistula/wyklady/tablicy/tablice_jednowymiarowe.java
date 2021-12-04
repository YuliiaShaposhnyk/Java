package pl.vistula.wyklady.tablicy;

public class tablice_jednowymiarowe {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i++){
            sample[i] = i;
        }

        for (i = 0; i < 10; i++ ){
            System.out.println("Element sample[" + i + "]: " + sample[i]);
        }
    }
}

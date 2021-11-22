package pl.vistula.czwiczenie_22_11_21;
import java.util.Arrays;
public class tablicaSpra_2 {
    public static void main(String[] args) {
        int[] some = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 0;
        boolean sp = true;
        System.out.println("Przed: ");
        System.out.println(Arrays.toString(some));
        for (int j = 1; j < some.length && sp; j++) {
            sp = false;
            k++;
            for (int i = 0; i < some.length - j; i++) {
                if (some[i] > some[i + 1]) {
                    int w = some[i];
                    some[i] = some[i + 1];
                    some[i + 1] = w;
                    k++;
                    sp = true;
                }
                k++;
                System.out.println("Po: ");
                System.out.println(Arrays.toString(some));
            }
        }
        System.out.println("Ilosc operacij: " + k);
    }
}

package pl.vistula.czwiczenie_22_11_21;
import java.util.Arrays;
public class tablicaSprawdzania {
    public static void main(String[] args) {
        int[] some =new int[] {10,9,8,7,6,5,4,3,2,1};
        int k = 0;

        System.out.println("Przed: ");
        System.out.println(Arrays.toString(some));

        for (int j = 1; j < some.length; j++){
            k++;
            for (int i = 0; i < some.length - j; i++){
                if (some[i] > some[i + 1]){
                    int w = some[i];
                    some[i] = some[i + 1];
                    some[i + 1] = w;
                    k++;
                }k++;
                System.out.println("Po: ");
                System.out.println(Arrays.toString(some));
            }
        }
        System.out.println("Ilosc operacij: " + k);
    }
}


/*Суть задания что в петли не считало то что остаеться не зменно,
 Считает на одину операцию меньше*/

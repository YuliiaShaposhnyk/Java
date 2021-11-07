package pl.vistula.wyklady;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;

        for (int x: nums){
            System.out.println("Wartosc elementu " + x);
            suma +=x;
        }
        System.out.println("Suma elementow tablicy: " + suma);
    }
}

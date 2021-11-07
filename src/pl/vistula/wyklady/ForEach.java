package pl.vistula.wyklady;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;

        for (int x: nums){
            System.out.println("Wartosc elementu " + x);
            suma +=x;
            if(x==5) break;
        }
        System.out.println("Suma elementow tablicy: " + suma);
        System.out.println();

        for (int x: nums){
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();

        for (int x: nums){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

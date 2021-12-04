package pl.vistula.wyklady.tablicy;

public class referencji_tablic {
    public static void main(String[] args) {
        int i;
        int num1[] = new int[10];
        int num2[] = new int[10];

        for (i = 0; i < 10; i++){
            num1[i] = i;
        }
        for (i = 0; i < 10; i++){
            num2[i] = -i;
        }
        System.out.println("Tablica num1: ");
        for (i = 0; i < 10; i++){
            System.out.print(num1[i] + " ");
        }

        System.out.println("\nTablica num2: ");
        for (i = 0; i < 10; i++){
            System.out.print(num2[i] + " ");
        }

        System.out.println();
        num2 = num1;

        System.out.println("Tablica num2 po przupisaniu: ");
        for (i = 0; i < 10; i++){
            System.out.print(num2[i] + " ");
        }

        System.out.println();
        num2[3] = 99;

        System.out.println("Oto num1 po modyfikacji za pomoca num2: ");
        for (i = 0; i < 10; i++){
            System.out.print(num1[i] + " ");
        }
        System.out.println();
    }
}

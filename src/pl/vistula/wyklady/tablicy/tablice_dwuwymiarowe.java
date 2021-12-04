package pl.vistula.wyklady.tablicy;

public class tablice_dwuwymiarowe {
    public static void main(String[] args) {
        int t, i;
        int table[][] = new int[6][4];

        for (t = 0; t < 6; ++t){
            for (i = 0; i <4; ++i){
                table[t][i] = (t*4) + i + 1;
                System.out.print(table[t][i] + "  ");
            }
            System.out.println();
        }
    }
}

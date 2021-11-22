package pl.vistula.HelloWorldYuliia.HelloWordShaposhnyk;

public class dwuwymiarowa {
    public static void main(String[] args) {
        int n = 10,i , j , suma = 0;
        int nums[][] = new int[n][n];

        for(i = 0; i < nums.length; i++){
            for (j = 0; j < nums.length; j++){
                if (i == j){
                    nums[i][j] = i;
                }else {
                    nums[i][j] = 0;
                }
                System.out.print(" " + nums[i][j] + " ");
            }
        System.out.println();
        }


    }
}

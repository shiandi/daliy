package Andy.homework;

import java.util.Scanner;

public class work3_4 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int m = temp.nextInt();
        int[][] A = new int[n][m];
        for(int i = 0;i<m;i++) {
            {
                for (int j = 0; j < n; j++) {
                    A[i][j] = temp.nextInt();
                }
            }
        }

    }
}

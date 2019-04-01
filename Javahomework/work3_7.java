package Andy.homework;

import java.util.Scanner;

public class work3_7 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);

        int lenth = temp.nextInt();
        int[][] A = new int[lenth][lenth];
        int[][] B = new int[lenth][lenth];
        int all = temp.nextInt();

        //输入A矩阵
        for (int a1 = 0;a1 < lenth;a1++){
            for (int b1 = 0;b1 <= a1;b1++){
                A[a1][b1] = temp.nextInt();
                if (a1 != b1)
                    A[b1][a1] = A[a1][b1];
            }
        }

        //输入B矩阵
        for (int a2 = 0;a2 < lenth;a2++){
            for (int b2 = 0;b2 <= a2;b2++){
                B[a2][b2] = temp.nextInt();
                if (a2 != b2)
                    B[b2][a2] = B[a2][b2];
            }
        }

        //计算乘积

        int[][] C = new int[lenth][lenth];
        int Temp = 0;
        for (int i = 0;i<lenth;i++){
            for (int j = 0;j<lenth;j++){

                for (int m = 0; m<lenth; m++){
                    Temp += A[i][m]*B[m][j];
                }
                C[i][j] = Temp;
                Temp = 0;

            }
        }

        for(int i = 0; i<lenth; i++){
            for (int j = 0; j<lenth; j++){
                System.out.printf("%d ",C[i][j]);
            }
            System.out.println('\n');
        }

    }
}

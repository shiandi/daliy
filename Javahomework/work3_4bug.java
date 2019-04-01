//找二维数组中的最大值和最小值
//并输出它的坐标

package Andy.homework;

import java.util.Scanner;

public class work3_4bug {
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
        int Max = A[0][0];
        int Min = Max;
        for(int g = 0;g<m;g++){
            for(int h = 0;h<n;h++){
                if(A[g][h] > Max)
                    Max = A[g][h];
                else if(A[g][h] < Min)
                    Min = A[g][h];
            }
        }
        for(int c = 0;c<m;c++){
            for(int d = 0;d<n;d++){
                if(A[c][d] == Min){
                    System.out.printf("%d %d %d\n",Min,c+1,d+1);
                }
            }
        }
        for(int a = 0;a<m;a++){
            for(int b = 0;b<n;b++){
                if(A[a][b] == Max){
                    System.out.printf("%d %d %d\n",Max,a+1,b+1);
                }
            }
        }

    }
}

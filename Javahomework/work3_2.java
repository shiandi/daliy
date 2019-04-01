package Andy.homework;

import java.util.Scanner;

public class work3_2 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);

        //输入A矩阵
        int x1 = temp.nextInt();
        int y1 = temp.nextInt();
        int[][] A = new int[x1][y1];
        for(int a1=0;a1<x1;a1++){
            for(int b1 = 0;b1<y1;b1++){
                A[a1][b1] = temp.nextInt();
            }
        }

        //输入B矩阵
        int x2 = temp.nextInt();
        int y2 = temp.nextInt();
        int[][] B = new int[x2][y2];
        for(int a2=0;a2<x2;a2++){
            for(int b2 = 0;b2<y2;b2++){
                B[a2][b2] = temp.nextInt();
            }
        }
        /*
        for (int m=0;m<x2;m++){
            for (int n=0;n<y2;n++){
                System.out.print(B[m][n] + " ");
            }
            System.out.println('\n');
        }
        */
        //输入交换的位置
        int X = temp.nextInt();
        int Y = temp.nextInt();
        //坐标转换为左上角
        X = X-x2;
        Y = Y-y2;

        //替换
        int i=0,j=0,TEMP=Y;
        for(i=0;X<x1&&i<x2;i++,X++){
            for(j=0,Y=TEMP;Y<y1&&j<y2;j++,Y++) {
                A[X][Y] = B[i][j];
            }
        }

        //输出
        for (int m=0;m<x1;m++){
            for (int n=0;n<y1;n++){
                System.out.print(A[m][n] + " ");
            }
            System.out.println('\n');
        }
    }
}

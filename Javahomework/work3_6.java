package Andy.homework;

import java.util.Scanner;

public class work3_6 {
    public static void main(String[] Args) {
        Scanner temp = new Scanner(System.in);

        //输入A矩阵
        int x1 = temp.nextInt();
        int y1 = x1;
        int[][] A = new int[x1][y1];
        for(int a1=0;a1<x1;a1++){
            for(int b1 = 0;b1<y1;b1++){
                A[a1][b1] = temp.nextInt();
            }
        }

        //输入B矩阵
        int x2 = temp.nextInt();
        int y2 = x2;
        int[][] B = new int[x2][y2];
        for(int a2=0;a2<x2;a2++){
            for(int b2 = 0;b2<y2;b2++){
                B[a2][b2] = temp.nextInt();
            }
        }

        //循环找顶点相同
        boolean p = true;
        int T = 0,a3 = 0,b3 = 0;
        int temp_a = a3,temp_b = b3,a4 = 0,b4 = 0;
        for(a3 = 0;a3<x1&&p;a3++){
            for(b3 = 0;b3<y1&&p;b3++){

                if (A[a3][b3] == B[0][0]&&(a3+x2<=x1)&&(b3+y2<=y1)){

                    for (temp_a = a3,a4 = 0;a4<x2&&p;a4++){
                        for (temp_b = b3,b4 = 0;b4<x2&&p;b4++){
                            if(A[temp_a][temp_b] != B[a4][b4]){
                                p = false;
                            }
                            temp_b++;

                        }
                        temp_a++;
                    }
                    //System.out.printf("%d,%d,%b\n",a4,b4,p);

                    if ((a4 == x2)&&(b4 == y2)&&p){
                        T = 1;
                }
                if (T == 1){
                    p = false;
                }
                else
                    p = true;
            }
            //System.out.printf("%d,%d\n",a3,b3);
        }
    }
        if(T == 1){
            System.out.printf("%d,%d",a3,b3);
        }
        else {
            System.out.println("-1");
        }
    }
}

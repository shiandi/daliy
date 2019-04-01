package Andy.homework;

import java.util.Scanner;

public class work3_5 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);
        int a = temp.nextInt();
        int[] M = new int[a];
        for (int i=0;i<a;i++){
            M[i] = temp.nextInt();
        }

        int max = M[0],min = M[0];
        for (int j = 0;j<a;j++){
            if (M[j]>max)
                max = M[j];
            else if (M[j]<min)
                min = M[j];
        }
        int all = 0;
        int Max = 0,Min = 0;
        for (int u = 0; u<a;u++) {
            if (M[u] == max&&Max == 0){
                Max++;
                continue;
            }
            else if (M[u] == min&&Min == 0){
                Min++;
                continue;
            }

            all += M[u];
        }
        System.out.printf("%.2f",(double)all/(a-2));

    }
}

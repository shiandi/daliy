package Andy.homework;

import java.util.Arrays;
import java.util.Scanner;

public class work3_10 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);
        int a = temp.nextInt();
        int[] A = new int[a];
        for (int i = 0;i<a;i++){
            A[i] = temp.nextInt();
        }
        int b = temp.nextInt();
        int[] B = new int[b];
        for (int i = 0;i<b;i++){
            B[i] = temp.nextInt();
        }

        int[] C = new int[a+b];

        for (int i =0;i<a;i++){
            for (int j = 0;j<b;j++){
                if (A[i]%B[j]==0)
                    A[i] = B[j];
                else if (B[j]%A[i]==0)
                    B[j] = A[i];
            }
        }
        int count = 0;

        for (int i =0;i<a;i++){
            C[count] = A[i];
            count++;
        }

        for (int i = 0;i<b;i++){
            C[count] = B[i];
            count++;
        }

        Arrays.sort(C);
        System.out.printf("%d",C[0]);
        for (int i = 1;i<C.length;i++){
            if (C[i]!=C[i-1])
            System.out.printf("%d ",C[i]);
        }
    }
}

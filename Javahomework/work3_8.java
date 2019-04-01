package Andy.homework;

import java.util.Scanner;

public class work3_8 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        int all = scan.nextInt();
        int[] A = new int[all];
        double average = 0;

        for (int i = 0; i<all; i++){
            A[i] = scan.nextInt();
            average += A[i];
        }
        average /= all;

        System.out.println(average);

        for (int i = 0; i<all; i++){
            if (A[i] > average)
                System.out.printf("%d:%.1f\n",i+1,(double)A[i]);
        }


    }
}

package Andy.homework;

import java.util.Scanner;

public class work3_1 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);
        System.out.println(prime(5));

    }
    public static int prime(int m){
        int out = 2;
        if (m == 1){
            return out;
        }
        for(int i = prime(m-1) ; ;i++ ){
            int j = 0;
            for (j = 2;j<i;j++){
                if (i%j == 0)
                    break;
            }
            System.out.println(0);
            j++;
            if (j == i)
                return j;
        }
    }
}

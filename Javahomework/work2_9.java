package Andy.homework;

import java.util.Scanner;
import java.math.*;

public class work2_9 {
    public static void main(String[] Args) {
        Scanner temp = new Scanner(System.in);
        int a = temp.nextInt();
        int b = temp.nextInt();
        int c = temp.nextInt();
        double s = (a+b+c)/2;
        System.out.printf("%.3f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}

package Andy.homework;

import java.util.Scanner;

public class work2_10 {
    public static void main(String[] Args) {
        Scanner temp = new Scanner(System.in);
        int C = temp.nextInt();
        double F = (double) C / 5 * 9 + 32;
        System.out.printf("%.1f", F);
    }
}

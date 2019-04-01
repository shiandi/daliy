package Andy.homework;

import java.util.Scanner;

public class work2_8 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);
        int input = temp.nextInt();
        int result = 0;
        while(input>0){
            result += input%10;
            input /= 10;
        }
        System.out.println(result);
    }
}

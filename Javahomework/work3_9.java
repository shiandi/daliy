package Andy.homework;

import java.util.Arrays;
import java.util.Scanner;

public class work3_9 {
    public static void main(String[] Args){
        Scanner temp = new Scanner(System.in);
        int lenth = temp.nextInt();

        String[] name = new String[lenth];
        int[] scores = new int[lenth];

        for (int i =0; i < lenth; i++){
            name[i] = temp.next();
            scores[i] = temp.nextInt();
        }

        char[] NAME = new char[15];
        for(int i =0;i<15;i++){
            NAME[i] = '#' ;
        }
        char[] SCORES = new char[5];
        for(int i =0;i<5;i++){
            SCORES[i] = '#';
        }

        student[] all = new student[lenth];
        for (int i = 0; i<lenth; i++){
            all[i] = new student(name[i],scores[i]);
        }

        Arrays.sort(scores);

        int count = lenth - 1, i = 0;
        while (count >= 0){
            for (i = 0;i<lenth;i++){
                if (all[i].scores == scores[count]){
                    count--;
                    break;
                }
            }
            int j ;
            for (j = 0;j<15-all[i].name.length();j++){
                System.out.printf("%s",NAME[i]);
            }
            System.out.printf("%s",all[i].name);

            String str = Integer.toString(all[i].scores);
            for (j = 0;j<5-str.length();j++){
                System.out.printf("%s",SCORES[j]);
            }
            System.out.println(all[i].scores);
        }


    }


    public static class student{
        String name ;
        int scores ;
        public student(String N,int s){
            this.name = N;
            this.scores = s;
        }
    }
}

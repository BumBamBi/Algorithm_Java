package BaeckJoon.배열;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        int max = 0;

        for(int i=0; i<9; i++){
            int temp = sc.nextInt();
            if(temp > max){
                idx = i;
                max = temp;
            }
        }

        System.out.println(max);
        System.out.println(idx+1);
        sc.close();
    }
}

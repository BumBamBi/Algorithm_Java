package BaeckJoon.배열;

import java.util.Scanner;

public class _2557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_cnt = new int[10];
        int result = 1;

        for(int i=0; i<3; i++){
            int temp = sc.nextInt();
            result *= temp;
        }

        String str = Integer.toString(result);

        for(int i=0; i<str.length(); i++){
            num_cnt[str.charAt(i)-'0']++;
        }

        for(int i=0; i<=9; i++){
            System.out.println(num_cnt[i]);
        }
        sc.close();
    }
}

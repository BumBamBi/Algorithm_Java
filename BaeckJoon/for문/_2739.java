package BaeckJoon.for문;

import java.util.Scanner;

public class _2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=9; i++){
            System.out.println(input + " * " + i + " = " + input*i);
        }
    }
}

package BaeckJoon.for문;

import java.util.Scanner;

public class _10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        int[] arr = new int[T];

        int A = 0;
        int B = 0;

        for(int i=0; i<T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            arr[i] = A+B;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}

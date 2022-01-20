package BaeckJoon.배열;

import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = -1000001;
        int min = 1000001;
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            if(temp > max){
                max = temp;
            }
            if(temp < min){
                min = temp;
            }
        }
        System.out.print(min + " " + max);
        sc.close();
    }
}

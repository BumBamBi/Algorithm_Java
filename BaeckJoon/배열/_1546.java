package BaeckJoon.배열;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] arr = new double[N];
        int max= -1;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = (int)arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
        }

        double result=0;
        for(double i : arr){
            result += i;
        }
        System.out.println(result/N);
        sc.close();        
    }
}

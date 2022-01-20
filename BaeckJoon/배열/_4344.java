package BaeckJoon.배열;

import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        double[] result = new double[N];

        // 테스트케이스
        for(int i=0; i<N; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            int sum = 0;
            Double avg = (double)0;
            
            // 한줄 각각 입력값 읽기
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            avg = (double)sum/n;
            
            int overCnt = 0;
            // 넘는 것 개수 확인
            for(int k=0; k<arr.length; k++){
                if(arr[k] > avg){
                    overCnt ++;
                }
            }
            result[i] = ((double)overCnt/n * 100);
        }
        for(int i=0; i<N; i++){
            System.out.printf("%.3f%%\n", result[i]);
        }
        sc.close();
    }
}

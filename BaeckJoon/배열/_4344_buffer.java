package BaeckJoon.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int N = Integer.parseInt(st.nextToken());
        double[] result = new double[N];

        // 테스트케이스
        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            int sum = 0;
            Double avg = (double)0;
            
            // 한줄 각각 입력값 읽기
            for(int j=0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
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
    }
}

package BaeckJoon.for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _15552 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // BufferedWriter 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 입력 저장
        int T = Integer.parseInt(in.readLine());

        for(int i=0; i<T; i++){
            // 한 줄 입력을 " " 으로 구분하는 StringTokenizer 생성 
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            // 각 값을 A와 B에 저장
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 합을 출력
            bw.write(A+B + "\n");
        }
        
        bw.close();
    }
}

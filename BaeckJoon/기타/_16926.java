package BaeckJoon.기타;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16926 {
   public static void main(String[] args) throws IOException {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st =new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M =Integer.parseInt(st.nextToken());
      int R = Integer.parseInt(st.nextToken());
      StringBuilder sb= new StringBuilder();
      int [][] arr = new int [N][M];
      
      for (int i = 0; i < N; i++) {
         st=new StringTokenizer(br.readLine());
         for (int j = 0; j < M; j++) {
            arr[i][j] = Integer.parseInt(st.nextToken());
         }
      }
      int start = 0;
      int col = 0;
      int row = 0;
      
      for (int i = 0; i < R; i++) {
         col=0;
         row=0;
         start=0;
         while(start<=Math.min(N, M)-2) {
            int temp=arr[col][row];
            for (int j = 0; j < M-1-start; j++) { //←
               arr[col][row]=arr[col][++row];
            }
            for (int j = 0; j < N-1-start; j++) { //↑
               arr[col][row]=arr[++col][row];
            }
            for (int j = 0; j < M-1-start; j++) {//→
               arr[col][row]=arr[col][--row];
            }
            for (int j = 0; j < N-1-start; j++) {//↓
               arr[col][row] = arr[--col][row];
            }
            col++;
            
            arr[col][row]=temp;
            row++;
            start+=2;
         }
      }
      
      for (int i = 0; i < N; i++) {
         for (int j = 0; j < M; j++) {
            sb.append(arr[i][j]).append(" ");
         }
         sb.append("\n");
      }
      System.out.println(sb.toString());
   }
}
package BaeckJoon.배열;

import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        int [] score = new int[N];

        for(int i=0; i<N; i++){
            String input = sc.nextLine();

            int sequence_cnt = 0;
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) == 'O'){
                    sequence_cnt++;
                    score[i] += sequence_cnt;
                }else{
                    sequence_cnt = 0;
                }
            }
        }
        for(int k:score){
            System.out.println(k);
        }
        sc.close();
    }
}

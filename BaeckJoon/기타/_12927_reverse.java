// 12927번을 역으로 하여 원하는 위치 불을 키는 문제

package BaeckJoon.기타;

import java.util.*;

class _12927_reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TCs = sc.nextInt();

        int[] ans = new int[TCs];

        for(int curTC=1; curTC<=TCs; curTC++){
            int N = sc.nextInt();
            
            boolean[] tf = new boolean[N+1];

            for(int i=1; i<=N; i++){
                if(sc.nextInt() == 1){
                    tf[i] = true;
                }
            }

            int cnt = 0;

            for(int i=1; i<=N; i++){
                if(tf[i] == true){
                    int tempIdx = i;
                    while(tempIdx <= N){
                        tf[tempIdx] = !tf[tempIdx];
                        tempIdx += i;
                    }
                    cnt++;
                }
            }
            ans[curTC-1] = cnt;
        }

        for(int i=1; i<=TCs; i++){
            System.out.println("#" + i + " " + ans[i-1]);
        }
        sc.close();
    }
}
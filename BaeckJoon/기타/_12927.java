package BaeckJoon.기타;

import java.util.*;

class _12927{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean[] tf = new boolean[s.length()+1];

        for(int i=1; i<=s.length(); i++){
            if(s.charAt(i-1) == 'Y'){
                tf[i] = true;
            }
        }

        int cnt = 0;

        for(int i=1; i<=s.length(); i++){
            if(tf[i] == true){
                int tempIdx = i;
                while(tempIdx <= s.length()){
                    tf[tempIdx] = !tf[tempIdx];
                    tempIdx += i;
                }
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
package BaeckJoon.배열;

import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] checkList = new boolean[42];

        for(int i=0; i<10; i++){
            int input = sc.nextInt();
            checkList[input%42] = true;
        }

        int cnt = 0;
        for(int i=0; i<checkList.length; i++){
            if(checkList[i] == true){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}

package BaeckJoon.while문;

import java.util.Scanner;

public class _1110_advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input < 10){
            input += input*10;
        }

        int cnt = 0;
        int newIntValue = input;
        do{
            newIntValue = (newIntValue%10)*10 + (newIntValue/10 + newIntValue%10)%10;
            cnt ++;
        }while(input != newIntValue);
        
        System.out.println(cnt);
        sc.close();
    }

}

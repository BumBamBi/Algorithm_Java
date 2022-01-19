package BaeckJoon.while문;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.length()==1){
            s += s;
        }
        
        String new_s = s;
        int cnt = 0;

        do{
            String temp = Integer.toString((new_s.charAt(0)-'0' + new_s.charAt(1)-'0'));
            if(temp.length() > 1){
                new_s = Character.toString(new_s.charAt(1)) + Character.toString(temp.charAt(1));
            }else{
                new_s = Character.toString(new_s.charAt(1)) + temp;
            }
            cnt += 1;
        }while(s.equals(new_s) == false);

        System.out.println(cnt);
        sc.close();
    }

}

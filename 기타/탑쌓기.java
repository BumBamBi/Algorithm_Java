package 기타;
/**
 * 탑쌓기
 * N만큼의 블럭을 두개로 쌓을 것임
 * (총블럭)N = (탑1)M1 + 탑(2)M2임
 * 각 층수 * 블럭의 무게 만큼의 비용이 들음 ex) 1층에 7 = 7, 5층에 3 = 15
 * 최소 비용으로 쌓을 경우 그 값은?
 */
import java.util.*;

public class 탑쌓기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TCs = sc.nextInt();

        int[] ans = new int[TCs];

        for(int curTC=1; curTC<=TCs; curTC++){
            int N = sc.nextInt();
            int M1 = sc.nextInt();
            int M2 = sc.nextInt();

            int[] cost = new int[N];
            for(int i=0; i<N; i++){
                cost[i] = sc.nextInt();
            }
            
            Arrays.sort(cost);

            int minHeight = Math.min(M1, M2);
            int result = 0;
            int height = 1;

            
            for(int i=N-1; i>= N-(2*minHeight); i-=2){
                result += cost[i]*height;
                result += cost[i-1]*height;
                height++;
            }

            for(int i = N-(minHeight*2)-1; i>=0; i--){
                result += cost[i] * height;
                height++;
            }

            ans[curTC-1] = result;
        }
        for(int i=0; i<TCs; i++){
            System.out.println("#" + (i+1) + " " + ans[i]);
        }

        sc.close();
    }
}

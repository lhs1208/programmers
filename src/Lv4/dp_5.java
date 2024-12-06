//도둑질
//https://school.programmers.co.kr/learn/courses/30/lessons/42897

package Lv4;

public class dp_5 {
	public static int solution(int[] money) {
        int n = money.length;
        
        // DP 배열 초기화
        int[] dp1 = new int[n - 1];  // 첫 번째 집을 훔치는 경우
        int[] dp2 = new int[n];      // 첫 번째 집을 훔치지 않는 경우
        
        // 첫 번째 집을 훔치는 경우 초기화
        dp1[0] = money[0];
        dp1[1] = Math.max(money[0], money[1]);
        
        // 첫 번째 집을 훔치지 않는 경우 초기화
        dp2[0] = 0;
        dp2[1] = money[1];
        
        // 첫 번째 집을 훔치는 경우 계산
        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + money[i]);
        }
        
        // 첫 번째 집을 훔치지 않는 경우 계산
        for (int i = 2; i < n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + money[i]);
        }
        
        // 마지막 집을 훔치는 경우와 훔치지 않는 경우 중 최댓값 반환
        return Math.max(dp1[n - 2], dp2[n - 1]);

    }
	
	public static void main(String[] args) {
		int[] money = {1, 2, 3, 1};
		System.out.println(solution(money));
	}

	
}

// 정수 삼각형
// https://school.programmers.co.kr/learn/courses/30/lessons/43105

package Lv3;

public class dp_2 {

	public static int solution(int[][] triangle) {
		int answer = 0;
        int n = triangle.length;
        
        // DP를 위한 배열 초기화
        int[][] dp = new int[n][n];
        dp[0][0] = triangle[0][0];
        
        System.out.println("n>>>" + n);
        
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + triangle[i][0];
//            System.out.println("dp["+ i +"][0] = dp[" +i+"-1][0] + triangle[" +i+"][0];");
//            System.out.println("dp["+ i +"-1][0] = "+ dp[i-1][0]);
//            System.out.println("triangle["+i+"][0] = "+ triangle[i][0]);
//            System.out.println("dp["+ i +"][0] = " + dp[i][0]);
//            System.out.println("---------------------------------");
            
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
//            System.out.println("dp["+ i +"][" +i+"] = dp[" +i+"-1][" +i+"-1] + triangle["+i+"]["+i+"]");
//            System.out.println("dp["+ i +"-1]["+i+"-1] = "+ dp[i-1][i-1]);
//            System.out.println("triangle["+i+"]["+i+"] = " + triangle[i][i]);
//            System.out.println("dp["+ i +"][" +i+"] =" + dp[i][i]);
//            System.out.println("---------------------------------");
            
            System.out.println(dp[i][i]);
            System.out.println("=================================");
        }
        
        
        System.out.println("------------ DP 진행 ------------");
        
        // DP 진행
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                
                int temp = i-1;
                int temp2 = j-1;
                
                
                //System.out.println("dp[" + i + "-1][" + j + "-1], dp[" + i + "-1][" + j +"]" + " + triangle[" + i + "][" + j + "];");
                
                System.out.println("dp[" + temp + "][" + temp2 + "], dp[" + temp + "][" + j +"]" + " + triangle[" + i + "][" + j + "];");
                
                System.out.println(dp[i-1][j-1]);
                System.out.println(dp[i-1][j]);
                System.out.println(triangle[i][j]);
                
                
            }
        }
        
        // 최대값 찾기
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, dp[n-1][i]);
        }
        
        return answer;
		
	}
	
	
	
	public static int solution2(int[][] triangle) {
		int n = triangle.length;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                
                int temp = i+1;
                int temp2 = j+1;
                
                System.out.println("triangle["+ temp +"]["+ j + "]");
                System.out.println(triangle[i + 1][j]);
                System.out.println("triangle["+ temp +"]["+ temp2 + "]");
                System.out.println(triangle[i + 1][j + 1]);
                
                System.out.println("triangle["+i+"]["+j+"] >>"  + triangle[i][j]);
                
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
                
                System.out.println("triangle["+i+"]["+j+"] 222>>"  + triangle[i][j]);
                
                System.out.println("-----------------------");
                
            }
            
            System.out.println("i>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + i);
            
        }
        return triangle[0][0];
	}
	
	public static void main(String[] args) {
		//int[][] triangle = {{7}, {3, 8}};
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		
		System.out.println(solution2(triangle));
		
	}

}

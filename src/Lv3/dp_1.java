//N으로 표현
//https://school.programmers.co.kr/learn/courses/30/lessons/42895

package Lv3;
import java.util.*;

public class dp_1 {
	
	public static int solution(int N, int number){
		//int MAX = 32001; // 제한사항에 따른 최대 수
		
        int answer = -1;
        List<Set<Integer>> dp = new ArrayList<>();
        
        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }

        // N을 1개 사용하는 경우부터 8개 사용하는 경우까지 계산
        for (int i = 1; i <= 8; i++) {
            
        	String Ns = "";
        	
        	//첫번째는 무조건 사칙연산없이 5가 N개 있을경우기 때문에 먼저 사칙연산 없는 자연수 5의 N개를 넣어준다.
            for (int j = 0; j < i; j++) {
                Ns += String.valueOf(N);
            }
            dp.get(i).add(Integer.parseInt(Ns));
            System.out.println("dp.get(i)>>" + i + " >>>> "+ dp.get(i));

            //사칙연산을 가지고 이제 사칙연산을 앞뒤로 해주면서 확인해준다.
            for (int j = 1; j < i; j++) {
                for (int preNum : dp.get(j)) {
                    for (int postNum : dp.get(i - j)) {
                        dp.get(i).add(preNum + postNum);
                        dp.get(i).add(preNum - postNum);
                        dp.get(i).add(preNum * postNum);
                        if (postNum != 0) {
                            dp.get(i).add(preNum / postNum);
                        }
                    }
                }
            }
            
        }

        for (int i = 1; i <= 8; i++) {
        	System.out.println("dp.get(i)>> " + i + "개 사용 함>>" + dp.get(i));
        	if (dp.get(i).contains(number)) {
                answer = i;
                break;
            }
        }

        return answer;
        
    }
	
	
	public static int solution2(int N, int number){
        int answer = -1;
        List<Set<String>> dp = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }
        
        dp.get(0).add("test");
        dp.get(0).add("test");
        dp.get(0).add("test3");
        dp.get(0).add("test");
        dp.get(0).add("test2");
        System.out.println(dp);
        return answer;
    }
	
	
	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		System.out.println(solution(N, number));
	}
	

}

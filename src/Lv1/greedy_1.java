//체육복
//https://school.programmers.co.kr/learn/courses/30/lessons/42862
package Lv1;

import java.util.Arrays;

public class greedy_1 {

    public static int solution(int n, int[] lost, int[] reserve) {
    	int[] students = new int[n + 1]; // 학생들의 체육복 수를 저장하는 배열

        // 초기화
        Arrays.fill(students, 1); // 모든 학생은 체육복이 1벌씩 있다고 가정
        

        for (int l : lost) {
            students[l]--; // 도난당한 학생의 체육복 수를 감소
        }

        for (int r : reserve) {
            students[r]++; // 여벌 체육복이 있는 학생의 체육복 수를 증가
        }

        for (int i = 1; i <= n; i++) {
            if (students[i] == 0) { // 체육복이 없는 학생인 경우
                if (i - 1 >= 1 && students[i - 1] > 1) {
                    // 앞번호 학생이 여벌 체육복이 있는 경우
                    students[i]++;
                    students[i - 1]--;
                } else if (i + 1 <= n && students[i + 1] > 1) {
                    // 뒷번호 학생이 여벌 체육복이 있는 경우
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] > 0) {
                answer++;
            }
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int n = 5; 
		int[] lost={2,4}; 
		int[] reserve ={1,3,5};
		
		System.out.println(solution(n,lost,reserve));
		
	}

}

// x만큼 간격이 있는 n개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954

package Lv1;

public class squence_x {

	public static long[] solution(int x, int n){
		long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
            System.out.println(answer[i]);
            
        }
        return answer;
	}
	
	public static void main(String[] args) {
			int x = 2;
			int n = 5;
			solution(x,n);
	}

}

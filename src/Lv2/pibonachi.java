//피보나치
//https://school.programmers.co.kr/learn/courses/30/lessons/12945
package Lv2;

public class pibonachi {

	public static int solution(int n){
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i<n+1; i++){
			arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
		}
		return arr[n];
	}
	
	public static void main(String[] args) {
		int n = 7;
		solution(n);
	}

}

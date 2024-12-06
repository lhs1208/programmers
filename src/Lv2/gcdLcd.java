//N개의 최소공배수
//https://school.programmers.co.kr/learn/courses/30/lessons/12953
package Lv2;

public class gcdLcd {

	public static int solution(int[] arr){
		int answer = arr[0];
		for(int i=1; i<arr.length; i++){
			answer = lcd(answer,arr[i]);
		}
		return answer;
	}
	
	public static int gcd(int a, int b){
		//최대공배수
		if(a%b ==0){
			return b;
		}
		return gcd(b,a%b);
	}
	
	public static int lcd(int a, int b){
		//최소공약수
		return a*b/gcd(a,b);
	}
	
	public static void main(String[] args) {
		//int[] arr = {2,6,8,14};
		int[] arr = {1,2,3};
		solution(arr);
	}
	
}

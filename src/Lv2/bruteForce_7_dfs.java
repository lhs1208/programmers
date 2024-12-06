//모음사전
//https://school.programmers.co.kr/learn/courses/30/lessons/84512

package Lv2;

import java.util.*;

public class bruteForce_7_dfs {

	static List answerList = new ArrayList<>();
	static String[] arr = {"A", "E", "I", "O", "U"};

	public static int solution(String word){
		int answer = 0;
		dfs("",0);
		
		for(int i=0;i<answerList.size();i++){
			if(answerList.get(i).equals(word)){
				answer = i;
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void dfs(String str, int depth){
		answerList.add(str);
		if(depth == 5) return;
		for(int i=0; i<arr.length;i++ ){
			dfs(str+arr[i],depth+1);
		}
	}
	
	public static void main(String[] args) {
		String word = "EIO";
		solution(word);
	}

}

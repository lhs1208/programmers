//가장큰수 Lv2
//https://school.programmers.co.kr/learn/courses/30/lessons/42746

package Lv2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class sort_2 {
	
	public static String solution(int[] numbers){
		String answer = "";
		
		String[] tempNum = new String[numbers.length];
		for(int a=0; a<numbers.length; a++){
			tempNum[a] = Integer.toString(numbers[a]);
		}
		
		Arrays.sort(tempNum, 
					new Comparator<String>(){
						@Override
						public int compare(String o1, String o2) {
							return (o2+o1).compareTo(o1+o2);
						}
					}
		);
		
		//람다식
		//내림차순 : (o2+o1).compareTo(o1+o2); 
		//오름차순 : (o1+o2).compareTo(o2+o1);
		//Arrays.sort(tempNum, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		
		String[] temp2 = {"a","c","b"};
		Arrays.sort(temp2, (o1,o2) -> (o1+o2).compareTo(o2+o1));
		for(String i:temp2){
			System.out.println(i);
		}
		
		for(int z=0; z<tempNum.length; z++){
			if(tempNum[0].equals("0")){
				return answer = "0";
			}
			answer += tempNum[z];
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		//int[] arrayNumber = {3, 30, 34, 5, 9};
		int[] numbers = {6, 10, 2};
		//int[] arrayNumber = {0,0};
		
		solution(numbers);
		
		

	}

}

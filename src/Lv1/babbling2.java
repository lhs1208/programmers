// 옹알이(2)
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
package Lv1;

public class babbling2 {
	
	 public static int solution(String[] babbling) {
	        int answer = 0;
	        for(int i =0; i < babbling.length; i++) {
	            babbling[i] = babbling[i].replace("aya", "1");
	            babbling[i] = babbling[i].replace("woo", "2");
	            babbling[i] = babbling[i].replace("ye", "3");
	            babbling[i] = babbling[i].replace("ma", "4");
	            
	            babbling[i] = babbling[i].replace("11", "z");
	            babbling[i] = babbling[i].replace("22", "z");
	            babbling[i] = babbling[i].replace("33", "z");
	            babbling[i] = babbling[i].replace("44", "z");
	            
	            
	            babbling[i] = babbling[i].replace("1", "");
	            babbling[i] = babbling[i].replace("2", "");
	            babbling[i] = babbling[i].replace("3", "");
	            babbling[i] = babbling[i].replace("4", "");
	            
	            if(babbling[i].isEmpty()) {
	                answer = answer + 1;
	            }
	        }
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		String[] test = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println(solution(test));
	}
}

// 옹알이(1)
// https://school.programmers.co.kr/learn/courses/30/lessons/120956
package Lv0;

public class babbling {
	public static int solution(String[] babbling) {
		int answer = 0; String a = null; String b = null; String c = null; String d = null;
		for(int i=0; i<babbling.length; i++){
			for(int z=0; z<4; z++){
				if(z == 0){
					a = "aya"; b = "ye"; c = "woo"; d = "ma";
					if( a.equals(babbling[i]) || a.concat(b).equals(babbling[i]) || a.concat(c).equals(babbling[i]) || a.concat(d).equals(babbling[i]) || a.concat(b).concat(c).equals(babbling[i]) || a.concat(b).concat(d).equals(babbling[i]) || a.concat(b).concat(c).concat(d).equals(babbling[i]) ||
						a.concat(b).concat(d).concat(c).equals(babbling[i]) || a.concat(c).concat(b).equals(babbling[i]) || a.concat(c).concat(d).equals(babbling[i]) || a.concat(c).concat(b).concat(d).equals(babbling[i]) || a.concat(c).concat(d).concat(b).equals(babbling[i]) || a.concat(d).concat(b).equals(babbling[i]) ||
						a.concat(d).concat(c).equals(babbling[i]) || a.concat(d).concat(b).concat(c).equals(babbling[i]) || a.concat(d).concat(c).concat(b).equals(babbling[i]) ){
						answer = answer+1;
						break;
						}
				}else if(z == 1){
					d = "aya"; a = "ye"; b = "woo"; c = "ma";
					if( a.equals(babbling[i]) || a.concat(b).equals(babbling[i]) || a.concat(c).equals(babbling[i]) || a.concat(d).equals(babbling[i]) ||a.concat(b).concat(c).equals(babbling[i]) || a.concat(b).concat(d).equals(babbling[i]) || a.concat(b).concat(c).concat(d).equals(babbling[i]) ||
						a.concat(b).concat(d).concat(c).equals(babbling[i]) || a.concat(c).concat(b).equals(babbling[i]) || a.concat(c).concat(d).equals(babbling[i]) ||a.concat(c).concat(b).concat(d).equals(babbling[i]) || a.concat(c).concat(d).concat(b).equals(babbling[i]) || a.concat(d).concat(b).equals(babbling[i]) ||
						a.concat(d).concat(c).equals(babbling[i]) || a.concat(d).concat(b).concat(c).equals(babbling[i]) || a.concat(d).concat(c).concat(b).equals(babbling[i]) ){
						answer = answer+1;
						break;
						}
				}else if(z == 2){
					c = "aya"; d = "ye"; a = "woo"; b = "ma";
					if( a.equals(babbling[i]) || a.concat(b).equals(babbling[i]) || a.concat(c).equals(babbling[i]) || a.concat(d).equals(babbling[i]) ||a.concat(b).concat(c).equals(babbling[i]) || a.concat(b).concat(d).equals(babbling[i]) || a.concat(b).concat(c).concat(d).equals(babbling[i]) ||
						a.concat(b).concat(d).concat(c).equals(babbling[i]) || a.concat(c).concat(b).equals(babbling[i]) || a.concat(c).concat(d).equals(babbling[i]) || a.concat(c).concat(b).concat(d).equals(babbling[i]) || a.concat(c).concat(d).concat(b).equals(babbling[i]) || a.concat(d).concat(b).equals(babbling[i]) ||
						a.concat(d).concat(c).equals(babbling[i]) || a.concat(d).concat(b).concat(c).equals(babbling[i]) || a.concat(d).concat(c).concat(b).equals(babbling[i]) ){
						answer = answer+1;
						break;
						}
				}else if(z == 3){
					b = "aya"; c = "ye"; d = "woo"; a = "ma";
					if( a.equals(babbling[i]) || a.concat(b).equals(babbling[i]) || a.concat(c).equals(babbling[i]) || a.concat(d).equals(babbling[i]) || a.concat(b).concat(c).equals(babbling[i]) || a.concat(b).concat(d).equals(babbling[i]) || a.concat(b).concat(c).concat(d).equals(babbling[i]) ||
						a.concat(b).concat(d).concat(c).equals(babbling[i]) || a.concat(c).concat(b).equals(babbling[i]) || a.concat(c).concat(d).equals(babbling[i]) || a.concat(c).concat(b).concat(d).equals(babbling[i]) || a.concat(c).concat(d).concat(b).equals(babbling[i]) || a.concat(d).concat(b).equals(babbling[i]) ||
						a.concat(d).concat(c).equals(babbling[i]) || a.concat(d).concat(b).concat(c).equals(babbling[i]) || a.concat(d).concat(c).concat(b).equals(babbling[i]) ){
						answer = answer+1;
						break;
						}
				}
			}
		}
        return answer;
    }
	
	//정규식 
	public static int solution1(String[] babbling) {
	        int answer = 0;
	        for(int i=0; i<babbling.length; i++){
	            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
	                answer++;
	            }
	        }
	        return answer;
	    }
	 
	 //치환
	 public static int solution2(String[] babbling) {
	        int answer = 0;
	        for(int i =0; i < babbling.length; i++) {
	            babbling[i] = babbling[i].replace("aya", "1");
	            babbling[i] = babbling[i].replace("woo", "1");
	            babbling[i] = babbling[i].replace("ye", "1");
	            babbling[i] = babbling[i].replace("ma", "1");
	            babbling[i] = babbling[i].replace("1", "");
	            if(babbling[i].isEmpty()) {
	                answer = answer + 1;
	            }
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		String[] test = {"aya", "yee", "u", "maa", "wyeoo","ayayewooma","ayayewoo"};
		System.out.println(solution(test));
	}
}






//소수찾기
//https://school.programmers.co.kr/learn/courses/30/lessons/42839

package Lv2;

import java.util.HashSet;

public class bruteForce_3_dfs {

	static HashSet<Integer> hs = new HashSet<>();
	
	public static int solution(String numbers) {
        dfs("",numbers);
        System.out.println(hs.size());
        return hs.size();
    }
	
	public static void dfs(String comb, String others){
		
		if(!comb.equals(""))
			if(primeNum(Integer.valueOf(comb)))	
				hs.add(Integer.valueOf(comb));
			
		for(int i=0; i<others.length(); i++){
			System.out.println("1>> " +i);
			System.out.println("2>> " +comb);
			System.out.println("3>> " +others.charAt(i)); 
			System.out.println("comb+others.charAt(i)>>>>>>>>> " +comb+others.charAt(i));
			System.out.println("others.substring(0,i)>> " +others.substring(0,i));
			System.out.println("others.substring(i+1)>> " +others.substring(i+1));
			System.out.println("---end-----" );
			dfs(comb+others.charAt(i), others.substring(0,i)+others.substring(i+1));
		}
	}
	
	public static boolean primeNum(int num){
		if(num==0||num==1) return false;
		
		for(int i=2;i*i<=num; i++){
			if(num%i==0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String numbers = "17";
		//String temp ="abcde";
		//System.out.println(numbers.substring(0,1) + numbers.substring(2));
		//System.out.println(numbers.substring(0,1) + numbers.substring(2));
		/*for(int i=0; i<numbers.length(); i++){
			System.out.println("numbers.charAt(i)>>> " + numbers.charAt(i));
			System.out.println("numbers.charAt(i) >>" + numbers.substring(0,i) + numbers.substring(i+1) );
			System.out.println("--------- end -----------");
		}*/
		
		System.out.println(solution(numbers)); 
	}

}

package Lv0;

public class arithmetic {
	
	public static int Solution(int[] common){
		int answer = 0;
		int first  = common[1] - common[0];
		int second = common[2] - common[1];
		
		if(first == second){
			answer = common[common.length-1] + first;
		}else{
			answer = common[common.length-1] * common[1]/common[0];
		}
		return answer;
	}
	
	public static void main(String[] arg){
		int[] common = {1, 2, 3, 4};
		System.out.println(Solution(common));
	}
	
}

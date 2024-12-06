//큰 수 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/42883

package Lv2;

import java.util.Stack;

public class greedy_3 {

	public static String solution(String number, int k) {
		int numSize = number.length();
		int index = 0;
		StringBuilder sb = new StringBuilder();
		//numSize-k 는 number 중에서 k 만큼 차감이 되는것이니깐 number-k 만큼 '선택' 할것이니 선택하는 for구문
		for(int i=0; i<numSize-k; i++){
			int max = 0;
			//선택된 index는 그 이전의 숫자들은 앞으로 선택하지 않기때문에 선택한 index의 다음 부터 max를 비교해야된다.
			//k+i를 하는 이유는 빼야하는 숫자 만큼만 구문을 돌려서 비교한다. (최초에는 i는 0이기 때문에 최초는 k이고, i는 선택개수이기때문에 선택되면 k+i를 더해서 마지막까지비교)
			//숫자가 5개이면 3개를 빼면 2개가 남는데, 이때 인덱스가 0,1,2,3 즉 마지막 숫자를 제외하고 비교를 한다.
			//마지막 숫자까지 비교하게된다면 다음에 남는 숫자가 없기때문에 2개를 만들수없기때문이다.
			//즉 빼는 숫자가 3개이면 2개를 골라야하는데 지금 선택하는 숫자(이게'='이 들어간이유)를 한개 고르면 한개가 남는데 이때 마지막 숫자는 비교하면 안되기때문에 4번째 index는 비교하지 않는다.
			for(int z=index; z<=k+i; z++){
				//charAt은 문자열이기때문에 이를 숫자로 나타나려면 '0', 48 둘중 한개를 골라서 빼준다.
				if(max < number.charAt(z)-48){
					max = number.charAt(z)-48;
					//z는 현재 인덱스이니깐 현재 인덱스가 max 값이면 그다음 숫자부터 다시 비교해야되기 때문에 index를 현재값 기준으로 +1 해준다.
					index = z+1;
				}
			}
			//z구문에서 모든 숫자를 비교했기때문에 해당 숫자는 앞에서 쓸 수 있는 숫자중에서 max 값이기때문에 sb에 넣어준다.
			sb.append(max);
		}
		return sb.toString();
    }
	
	
	//형변환 공부 외우기.
	public static String solution2(int number, int k) {
        String answer = "";

        String temp = String.valueOf(number);
        System.out.println(temp);
        
        //Integer을 사용해서 parseInt, toString 이건 인티저 안에 두개가 있음.
        int temp2 = Integer.parseInt(temp);
        String temp3 = Integer.toString(temp2);
        
       //String을 통해서 valuof로 스트링으로 변경. 
        String temp4 = String.valueOf(temp2);
        
        Stack<Character> stack = new Stack<>();
        for(char digit : temp.toCharArray()  ){
        	System.out.println(digit);
        }
        
        return answer;
    }
	
	public static String solution3(String number, int k){
		
		char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
        
	}
	
	
	
	
	
	public static void main(String[] args) {
		String number = "1924";
		int number2 = 1924;
		int k = 2;
		System.out.println(solution(number,k));
	}

}

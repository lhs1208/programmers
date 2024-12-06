//카펫
//https://school.programmers.co.kr/learn/courses/30/lessons/42842

package Lv2;

public class bruteForce_4 {

	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        //갈색부분은 한줄로 되어져있기때문에 최소한의 가로,세로의 길이는 3이다.
        //이때 노란색 타일이 가로,세로로 한줄씩 증가할 수있기때문에 최소한의 갈색타일길이를 생각하여 i는 3으로 시작을한다.
        for (int i = 3; i <= total / 3; i++) {
            // i의길이로 total을 나누었을때 나눠떨어지지않으면 타일이 부족하여 사각혀이 만들어지지 않기때문에 먼저 나누어서 확인해준다. 
        	if (total % i == 0) {
                //가로의길이는 세로의길이 나누기 토탈이기때문에.
        		int width = total / i;
        		//세로의 길이는 i
                int height = i;
                
                //여기서 갈색타일은 한줄이기때문에 위아래로 쌓여져 있어야한다.
                //그렇기때문에 우선 세로의 길이에서 위아래로 쌓인 부분인 2를 빼준다.
                //가로역시 좌우로 갈색타일을 빼준다.
                //그렇게된다면 노란색의 가로,세로 길이가 나오고 이를 곱하면 노란색 타일의 total이 나온다.
                //이때 노란색과 타일 수가 같으면 이부분이 가로,세로의 정답이 된다.
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		//10 2	[4, 3]
		//8	 1	[3, 3]
		//23 1
		//24 24	[8, 6]
		int brown = 10;
		int yellow = 2;
		System.out.println(solution(brown,yellow));
	}

}

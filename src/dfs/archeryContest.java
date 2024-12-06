package dfs;

public class archeryContest {

	
	public static int[] solution(int n, int[]info){
		int[] answer = new int[11];
		
		dfs(0, n, 0, new int[n], info);
		
		return answer;
	}
	
	
	public static void dfs(int start, int r, int idx, int[]result, int[] info){
		if(idx == r){
			int[] info2 = new int[11];
			//과녁 점수를 어피치와 같이 과녁점수 맞춘 갯수로 표현
			for(int score : result){
				info[10-score]++;
			}
			
			
			int ryan = 0;
			int apeach = 0;
			
			for(int i=0; i<11; i++){
				//info[0] = 10점, info[1] = 9점 맞추기위해 score 계산
				int score = 10 - i;
				//라이언이 이긴 경우
				if(info2[i] > info[i]){
					ryan += score;
				}
				
			}
			
			
		}
		
		
		return;
	}
	
	
	
	
	
	public static void main(String[] args){
		
	}
	
	
	
}

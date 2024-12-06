//네트워크
//https://school.programmers.co.kr/learn/courses/30/lessons/43162

package Lv2;

public class dfs_2 {

	
	public static int solution(int n, int[][] computers){
		int answer = 0;
		
		 boolean[] visited = new boolean[n];
		
		 for(int i=0; i<n; i++){
			 if (!visited[i]) {
				 dfs(i,computers,visited);
				 answer++;
			 }
		 }
		
		 System.out.println(answer);
		return answer;
		
	}
	
	
	public static void dfs(int n, int[][] computers, boolean[] visited){
		visited[n] = true;
		for(int z=0; z<computers.length; z++){
			if(visited[z] == false && computers[n][z] == 1){
				dfs(z,computers,visited);
			}
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		solution(n, computers);
	}
	

}

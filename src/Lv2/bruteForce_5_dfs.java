//피로도
//https://school.programmers.co.kr/learn/courses/30/lessons/87946

package Lv2;

public class bruteForce_5_dfs {

	public static int max = 0;
	
	public static int Solution(int k, int[][] dungeon){
		int[] check = new int[dungeon.length];
		dfs(k,0,dungeon,check);
		System.out.println(max); 
		return max;
	}
	
	private static void dfs(int k, int cnt, int[][] dungeon, int[] check) {
		for(int i=0; i<dungeon.length; i++){
			if(k >= dungeon[i][0] && check[i] == 0){
				check[i] = 1;
				dfs(k-dungeon[i][1], cnt+1, dungeon, check);
				check[i] = 0;
			}
		}
		if(max < cnt){
			max = cnt;
		}
	}

	public static void main(String[] args) {
		int k = 80;
		int[][] dungeon = {{80,20},{50,40},{30,10}};
		Solution(k,dungeon);
	}

}

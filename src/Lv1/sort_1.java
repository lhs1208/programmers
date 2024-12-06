// K번째 수
// array  부분의 copyOfRange의 존재를 알게된 문제.
// 프로그래머스 https://school.programmers.co.kr/learn/courses/30/lessons/42748
package Lv1;

import java.util.Arrays;

public class sort_1 {

	public static int[] solution(int[] array, int[][] commands){
		int[] answer = new int[commands.length];
		
		for(int i = 0; i< commands.length; i++){
			
			int commandsArray[] = new int[commands[i][1] - commands[i][0] + 1];
			int x = 0;
			for(int z =0; z< array.length; z++){
				if(z >= commands[i][0]-1){
					if(z <= commands[i][1]-1){
						commandsArray[x] = array[z];
						x++;
					}
				}
			}
			
			Arrays.sort(commandsArray);
			answer[i] = commandsArray[commands[i][2] - 1];
		}
		return answer;
	}
	
	public static int[] solution2(int[] array, int[][] commands){
		int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
	}
	
	
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution2(array, commands));
	}

}

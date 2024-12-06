//모의고사
//https://school.programmers.co.kr/learn/courses/30/lessons/42840

package Lv1;

import java.util.Arrays;

public class bruteForce_2 {

	public static int[] solution(int[] answers) {
		
		int[] sortAnswer = new int[3];
		int[] compareAnswer = new int[3];
        int[][] student = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};        
        
        //각각의 학생들이 맞힌갯수를 두개의 배열에다가 담는다.
        for(int y=0;y<3;y++){
        	int count = 0;
        	int z = 0;
        	for(int i=0;i<answers.length; i++){
            	if(student[y][z] == answers[i]){
            		count++;
            	}
            	z++;
            	if(z == student[y].length){
            		z = 0;
            	}
            }
        	sortAnswer[y] = count;
        	compareAnswer[y] = count;
        	System.out.println(compareAnswer[y]);
        }

        //학생 수는 3명이기때문에 가장 많이 맞힌 갯수를 찾기위해서 정렬한다.
        //이렇게되면 어떤 학생이 몇문제를 맞힌지를 알 수있는건아니지만 이 학생들 중에서 제일 많이 맞힌 갯수를 알 수있습니다.
        Arrays.sort(sortAnswer);
        
        //이때 맞힌갯수가 최대값을 동시에 가질 수도있기때문에 크 최대값이 몇개인지를 찾는 구문을 만들어준다.
        int sortCountSize= 0;
        for(int s=0;s<3;s++){
        	if(sortAnswer[2] == compareAnswer[s] ){
        		sortCountSize++;
        	}
        }

        //최대값 갯수만큼 배열을 만들어준다.
        int[] answer = new int[sortCountSize];
        int sortCount= 0;
        
        //만든 배열을 가지고 최대값을 가지고있는 인덱스를 넣어서 답을 출력한다.
        for(int s=0;s<3;s++){
        	if(sortAnswer[2] == compareAnswer[s] ){
        		answer[sortCount] = s+1;
        		sortCount++;
        	}
        }
        
        return answer;
        
    }
	
	
	public static void main(String[] args) {
		//int[] answers = {1,2,3,4,5};
		//int[] answers = {1,3,2,4,2};
		int[] answers = {2, 1, 2, 3, 2};
		
		System.out.println(solution(answers));
	}

}

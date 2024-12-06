// 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586

package Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class stackQue_2 {

	public static int[] solution(int[] progresses, int[] speeds) {
        int count =0;
    	int compareDay = 0;
    	boolean trueFalse = false;
    	ArrayList<Integer> list = new ArrayList<>();
    	
        for(int i=0; i<progresses.length; i++){
        	if(trueFalse == false){
        		compareDay = dayCheck(progresses[i],speeds[i]);
        		trueFalse = true;
        	}else{
        		trueFalse= possibleAble(progresses[i],speeds[i],compareDay);
        		if(trueFalse == false){
        			list.add(count);
        			count =0;
        			compareDay = dayCheck(progresses[i],speeds[i]);
            		trueFalse = true;
        		}
        	}
        	//기간안에 완료 되면 count 수를 세준다.
        	if(trueFalse == true){
        		count++;
        	}
        	//마지막일때는 지금까지 count한 갯수 넣어준다.
    		if(i == progresses.length-1){
    			list.add(count);
    		}
        }
        
        int[] answer = new int[list.size()];
        for(int z=0; z<list.size(); z++){
        	System.out.println(list.get(z));
        	 answer[z] = list.get(z);
        }
        
        return answer;
    }
	
	public static int dayCheck(int progress, int speed){
		int days = 0;
		int remainProgress  = 100 - progress;
		days = remainProgress / speed;
		int temp =(days*speed) + progress;
		if( temp < 100 ){
			days++;
		}
		return days;
	}
	
	public static boolean possibleAble(int progress, int speed, int days){
		int remainProgress  = 100 - progress;
		int speedDays = speed*days;
		int temp = progress + speedDays;
		if(temp < 100){
			return false;
		}else{
			return true;
		}
	}
	
	//람다식 공부.
	public static int[] solution2(int[] progresses, int[] speeds) {
		int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            System.out.println(dayOfend[day]);
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
	
	
	public static void main(String[] args) {
		//int[] progresse ={93, 30, 55};
		//int[] speeds ={1, 30, 5};
		
		int[] progresse ={95, 90, 99, 99, 80, 99};
		int[] speeds ={1, 1, 1, 1, 1, 1};
		
		solution(progresse,speeds);
		
	}

}

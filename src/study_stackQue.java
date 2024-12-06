import java.util.*;

public class study_stackQue {

	
	public static int solution(int bridge_length, int weight, int[] truck_weights){
		int answer = 0; 
		
		if(bridge_length == 1) return truck_weights.length+1;
		if(truck_weights.length == 1) return bridge_length+1;

		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<bridge_length; i++){
			q.offer(0);
		}
		
		int idx = 0;
		int sum = 0;
		
		System.out.println(truck_weights.length);
		
		while(idx < truck_weights.length){
			sum -= q.poll();
			answer++;
			if(sum + truck_weights[idx] <= weight){
				q.offer(truck_weights[idx]);
				sum += truck_weights[idx];
				idx++;
			}else{
				q.offer(0);
			}
		}
		
		
		return answer + bridge_length;
	}
	
	
	
	
	public static void main(String[] args) {
		/*int bridge = 2;
		int weight = 10;
		int[] truck_weight ={7,4,5,6};*/
		
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		//int[] truck_weights = {10};
		
		
		System.out.println(solution(bridge_length,weight,truck_weights));
		
	}

}

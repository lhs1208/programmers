// 프로세스
// https://school.programmers.co.kr/learn/courses/30/lessons/42587 

package Lv2;
import java.util.LinkedList;
import java.util.Queue;

public class stackQue_4 {

	public static String solution2(){
		return null;
		
	}
	
	
	public static int solution(int[] priorities, int location) {
		int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }
        
        System.out.println("queue.size()asdasdasd>> " +queue.size());

        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean isHighestPriority = true;

            for (int priority : queue) {
            	if (current < priority) {
                    isHighestPriority = false;
                    break;
                }
            }

            if (isHighestPriority) {
            	answer++;
            	System.out.println(queue);
                if (location == 0) {
                	break;
                }
            } else {
            	System.out.println(isHighestPriority);
            	queue.offer(current);
            	System.out.println(queue);
            }
            
            location--;
            //System.out.println("location >>  " + location);
            if (location < 0) {
            	location = queue.size() - 1;
            	System.out.println("location >>" + location);
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,2,3};
		int location = 1;
		System.out.println(solution(priorities, location));
	}

}

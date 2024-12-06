// 더 맵게
// https://school.programmers.co.kr/learn/courses/30/lessons/42626

package Lv2;

import java.util.PriorityQueue;

public class heap_1 {

	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for(int i : scoville){
			heap.offer(i);
		}
		
		int mixCount = 0;
		
		while(heap.peek() < K){
			if(heap.size() < 2){
				return -1;
			}
			int a = heap.poll();
			int b = heap.poll();
			int mix = a + (b*2);
			heap.offer(mix);
			mixCount++;
		}
		
		return mixCount;
	}
	
	
	public static void main(String[] args) {
		int[] scovile = {1, 2, 3, 9, 10, 12};
		solution(scovile, 7);
	}

}

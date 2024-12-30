package sk_test;

import java.util.*;

public class solution_3 {

	private static int solution(int[] scores, int k) {
		int n = scores.length;
		int[] dif = new int[n-1];
		
		for(int i=0; i<n-1; i++){
			dif[i] = scores[i+1] - scores[i];
		};
        Arrays.sort(dif);
        
        int sum = 0;
        for(int i=0; i<dif.length-(k-1); i++){
        	sum += dif[i];
        }
        
        System.out.println(sum);
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] scores = {1, 3, 7, 8, 10, 15};
		int k = 3;
        
		/*int[] scores = {1, 2, 12, 14, 15};
        int k = 2;*/
		
		solution(scores,k);
	}

}

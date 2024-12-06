//완주하지못한 선수
//https://school.programmers.co.kr/learn/courses/30/lessons/42576

package Lv1;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class hashmap_2 {

	public static String solution(String[] participant, String[] completion) {        
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String player : participant){
        	System.out.println(player);
        	System.out.println(hm.getOrDefault(player, 0)+1);
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        
        for(String player : completion){
        	hm.put(player, hm.get(player) - 1);
        }

        for(String key : hm.keySet()) {
           
        	System.out.println("key>> "+key);
        	System.out.println(hm.get(key));
        	
        	if (hm.get(key) != 0){
                answer = key;
            }
        }
        
        System.out.println("-------------");
        System.out.println(answer);
        return answer;
    }
	
	
	public static void main(String[] args) {
		//String[] participant= {"leo", "kiki", "eden"};
		//String[] completion= {"leo", "kiki"};
		
//		String[] participant= {"marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion= {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant= {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
		
		solution(participant,completion);
		
	}

}

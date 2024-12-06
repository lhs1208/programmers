//전화번호 목록
//https://school.programmers.co.kr/learn/courses/30/lessons/42577

package Lv1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class hashmap_3 {
	
	 public static boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (int i = 0; i < phone_book.length; i++){ 
	            hm.put(phone_book[i], hm.getOrDefault(phone_book[i], 0) + 1);
	        }
	        for(String key : hm.keySet()) {
	            if(hm.get(key) > 1){
	            	answer = false;
	            	return answer;
	            }
	        }
	        for (int i = 0; i < phone_book.length; i++){
	        	for (int j = 0; j < phone_book[i].length(); j++){
	        		if (hm.containsKey(phone_book[i].substring(0, j))){
	                	return false;
	                }
	            }
	        }
	        
	        return answer;
	 	}
	 
	 public static boolean solution2(String[] phoneBook) {
	       for(int i=0; i<phoneBook.length-1; i++) {
	    	   for(int j=i+1; j<phoneBook.length; j++) {
					if(phoneBook[i].startsWith(phoneBook[j])){
						return false;
					}
					if(phoneBook[j].startsWith(phoneBook[i])){
						return false;
					}
	           }
	        }
	        return true;
	    }
	 
	
	public static void main(String[] args) {
		String[] phone_book = {"11", "119", "97674223", "1195524421"};
		//String[] phone_book = {"123","456","789"};
		//String[] phone_book = {"12","123","1235","567","88"};
		
		solution(phone_book);
		
	}

}

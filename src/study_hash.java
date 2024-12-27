import java.util.*;
import java.util.Map.Entry;


public class study_hash {

	public static int hash(){
		//int[] nums = {3,3,3,2,2,2};
		int[] nums = {3,2};
		String[] temp = {"a","b","a"};
		
		HashMap<String, Integer> hash = new HashMap<>();
		for(String key : temp){
			hash.put(key, hash.getOrDefault(key, 0) + 1);
			System.out.println(hash);
			//hash 안에 들어가있는 key값을 가져오는것
			System.out.println(hash.keySet());
			//hash 안에 있는  ket값의 value(두번째들어가는거)를 가져옴
			System.out.println(hash.get(key));
		
			//key값 포함하는지 여부 파악
			System.out.println(hash.containsKey("a"));
			//value값 포함하는지 여부 파악
			System.out.println(hash.containsValue(2));
			
		}
		
		for(Entry<String, Integer> entry : hash.entrySet()){
			//키값
			entry.getKey();
			//밸류값
			entry.getValue();
		}
		
		
		
		
		return 0;
	}
	
	
	public static int hash2(){
		Map<Integer, String> map = new HashMap<Integer, String>();        
		map.put(1, "Apple");        
		map.put(2, "Banana");        
		map.put(3, "Orange");        
		map.put(4, null);
		
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		Map<String, String> hs = new HashMap<String, String>();
		System.out.println(clothes.length);
		System.out.println(clothes[0][1]);
		
		for(int i=0; i<clothes.length; i++){
			hs.put(clothes[i][0], clothes[i][1]);
		}
		System.out.println(hs); 
		System.out.println(hs.keySet());
		System.out.println(hs.get("crow_mask"));
		
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		hash();
	}

}

import java.util.*;


public class study_generic {

	
	class pair<K,V>{
		private K key;
		private V value;
		
		public void Pair(K key, V value){
			this.key = key;
			this.value = value;
		}
		
		
	}
	
	public static <T> T test(T first, T second){
		//int temp = (Integer) ((Integer) first + (Integer) second);
		String temp = (String) first + second;
		System.out.println(temp);
		return (T) temp;
	}
	
	
	public static <E> E test2(List<E> list){
		for(E element:list){
			System.out.println(element);
		}
		return (E) list;
	}
	
	
	public static <K,V> pair<K,V> test3(HashMap<K, V> hs){
		
		for(Map.Entry<K, V> temp : hs.entrySet()){
			System.out.println(temp.getKey());
			System.out.println(temp.getValue());
			System.out.println(temp);
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		String temp = "test";
		String temp2 = "test2";
		//test(a,b);
		//test(temp,temp2);
		
		
		List<String> arr = new ArrayList<>();
		arr.add("apple");
		arr.add("apple2");
		arr.add("apple3");
		List<Integer> arr2 = new ArrayList<>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		//test2(arr2);
		
		
		HashMap<String, Integer> hs = new HashMap<>();
		
		hs.put("test", 1);
		hs.put("test2", 2);
		hs.put("test3", 3);
		test3(hs);
		
		
	}
	
}

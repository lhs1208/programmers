import java.util.*;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;


public class study_sort {

	public static int sort1(){
		//1차원 배열 정렬
		
		//------------int, integer----------------
		//오름차순
		int[] temp = {3,4,2,6};
		Arrays.sort(temp);
		for(int i=0; i<temp.length; i++){
			System.out.println(temp[i]);
		}
		
		//내림차순 --> 숫자 내림차순은 래퍼클래스로 해야함 
		Integer[] arr = {3,4,2,6};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i: arr){
			System.out.println("["+i+"]");
		}
        
        //----------String --------------
        //오름차순
        String[] str = {"a","f","c"};
        Arrays.sort(str);
        for(String i: str){
			System.out.println("["+i+"]");
		}
        
        //내림차순
        Arrays.sort(str, Collections.reverseOrder());
        for(String i: str){
			System.out.println("["+i+"]");
		}
		
		return 0;
	}
	
	public static String sort2(){
		//arrayList
		//ArrayList<Integer> arr = new ArrayList<>();
		List<Integer>  arr = new ArrayList<>();
		arr.add(3);
		arr.add(1);
		arr.add(0);
		
		//오름차순
		Collections.sort(arr);
		for(int temp : arr){
			System.out.println(temp);
		}
		
		//내림차순
		Collections.sort(arr, Collections.reverseOrder());
		for(int temp : arr){
			System.out.println("[" + temp + "]");
		}
		
		
		
		//배열 공부 etc
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		
		for(int temp : list2){
			System.out.println("[" + temp + "]");
		}
		
		return null;
	}
	
	
	public static int sort3(){
		
		ArrayList<student> list = new ArrayList<>();
		
		list.add(new student("james",35));
		list.add(new student("david",40));
		list.add(new student("sam",37));
		list.add(new student("alis",38));
		
		//내림차순
		Collections.sort(list, (o1,o2)-> o2.age - o1.age);
		//오름차순
		//Collections.sort(list, (o1,o2)-> o1.age - o2.age);
		
//		System.out.println(list.get(0).age);
//		System.out.println(list.get(1).age);
//		System.out.println(list.get(2).age);
//		System.out.println(list.get(3).age);

		
		//내림차순
		//Collections.sort(list, (o1,o2)-> (o2.name+o1.name).compareTo(o1.name+o2.name));
		//오름차순
		Collections.sort(list, (o1,o2)-> (o1.name+o2.name).compareTo(o2.name+o1.name));
		
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		System.out.println(list.get(1).name);
		System.out.println(list.get(1).age);
		System.out.println(list.get(2).name);
		System.out.println(list.get(2).age);
		System.out.println(list.get(3).name);
		System.out.println(list.get(3).age);
		
		
		
		
		return 0;
	}
	
	
	 static class student{
	 	String name;
        int age;
        public student(String name, int age) {
            this.name = name;
            this.age = age;
        }
	 }
	
	
	
	public static void main(String[] args) {
		//sort1();
		//sort2();
		sort3();
	}

}

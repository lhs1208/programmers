package softeer;

import java.lang.reflect.Array;
import java.util.*;

public class carTest_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int q = scan.nextInt();
		int[] fuelEfficiencies = new int[n];
		
		for(int i=0; i<n; i++){
			fuelEfficiencies[i] = scan.nextInt();
		}
		
		Arrays.sort(fuelEfficiencies);
			
		for(int z=0; z<q; z++){
			int m = scan.nextInt();
			int exitYn = Arrays.binarySearch(fuelEfficiencies, m);
			int count = 0;
			System.out.println("exitYn>> " + exitYn);
			if(exitYn > 0){
				count = (n-1-exitYn)*exitYn;
			}
			System.out.println(count);
		}
		
	}
	
	
	//속도때문에 안됨.
	public static void main2(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 자동차 수
        int q = scanner.nextInt(); // 질의 수
        //int[] fuelEfficiencies = new int[n];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        	//fuelEfficiencies[i] = scanner.nextInt();
        	list.add(scanner.nextInt()); // 자동차 연비
        }
        
        //Arrays.sort(list); // 연비 오름차순 정렬
        System.out.println(list);
        
        Collections.sort(list);
//        System.out.println("list2>> "  + list);
//        System.out.println("list2>> "  + list.size());
//        System.out.println("list3>> "  + list.get(0));
        
        for (int i = 0; i < q; i++) {
        	//int totSize = list.size() - 1;
            int m = scanner.nextInt(); // 중앙값
            int totSize = n - 1;
            int count = 0;
            boolean containsList = list.contains(m);
            
//            System.out.println("containsList>>> " + containsList);
//            System.out.println("연비의 중앙값>>>  " + list.get(list.size()/2));
//            System.out.println("인덱스 값 >>> " +  list.indexOf(m));
            
            if(containsList){
            	int index = list.indexOf(m);
            	count = (totSize - index)* index;
//            	if(m < list.get(list.size()/2)){
//            		//왼쪽에서 가까울때
//                	for(int left = 0; left<n; left++){
//                     	//int fuel = (int) fuelEfficiencies[left];
//                     	int fuel = (int) list.get(left);
//                     	if(fuel == m){
//                     		int afterRight = totSize - left;
//                     		System.out.println("left>>" + left);
//                     		System.out.println("afterRight>>" + afterRight);
//                     		count = afterRight*left; 
//                     		break;
//                     	}
//                     }
//            	}else{
//            		//오른쪽에서 가까울때
//                	for(int right = n - 1;  0 <= right; right--){
//                		int fuel = (int) list.get(right);
//                		if(fuel == m){
//                     		int afterRight = totSize - right;
//                     		System.out.println("right" + right);
//                     		System.out.println("afterRight>>" + afterRight);
//                     		count = right*afterRight; 
//                     		break;
//                     	}
//                	}
//                }
            }
            
            System.out.println(count);
        }
	}
	
	
	//리스트에 담고 contains, indexOf 공부용
    public static void main3(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            list.add(i);
        }

        Scanner scan = new Scanner(System.in);
        
        //int target = 10000;
        int target = scan.nextInt();
        
        int index = list.indexOf(target);
        boolean trueFalse = list.contains(target);
        
        System.out.println("contains existence and nonexistence > " + trueFalse);
        
        if (index != -1) {
            System.out.println("Index of " + target + ": " + index);
        } else {
            System.out.println(target + " not found in the list.");
        }
    }
	
	
	
}

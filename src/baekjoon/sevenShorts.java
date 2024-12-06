package baekjoon;
import java.util.*;

public class sevenShorts {
	
	public static void solution(int[] shotsTall){
		
		int totalSum = 0;
		for(int i=0; i<shotsTall.length; i++){
			totalSum += shotsTall[i];
		}
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalSum - shotsTall[i] - shotsTall[j] == 100) {
                	shotsTall[i] = shotsTall[j] = 0;
                    Arrays.sort(shotsTall); 
                    for (int k = 2; k < 9; k++) {
                        System.out.println(shotsTall[k]);
                    }
                    return;
                }
            }
        }
        
	}
	
	public static void main(String[] args){
		/*int[] shotsTall = {20,7,23,19,10,15,25,8,13};
		solution(shotsTall);*/
		
		
		
		/*Scanner scan2 = new Scanner(System.in);
		String[] shotsTall2 = new String[3];
		for(int i=0; i<3; i++){
			shotsTall2[i] = scan2.next();
		}
		
		for(int i=0; i<3; i++){
			System.out.println(shotsTall2[i]); 
		}*/
		
		
		Scanner scan = new Scanner(System.in);
		int[] shotsTall = new int[9];
		for(int i=0; i<9; i++){
			shotsTall[i] = scan.nextInt();
		}
		
		
		int totalSum = 0;
		for(int i=0; i<9; i++){
			totalSum += shotsTall[i];
		}
		
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalSum - shotsTall[i] - shotsTall[j] == 100) {
                	shotsTall[i] = shotsTall[j] = 0;
                    Arrays.sort(shotsTall); 
                    for (int k = 2; k < 9; k++) {
                        System.out.println(shotsTall[k]);
                    }
                    return;
                }
            }
        }
        
	}
	
	
}



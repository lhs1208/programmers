package softeer;
import java.util.*;

public class dna4_3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//갯수
		int M = scan.nextInt();
		//줄기길이
		int N = scan.nextInt();
		
		List<String> listDna = new ArrayList<>();
		for(int i=0; i<M; i++){
			listDna.add(scan.next());
		}
		
		for(int z=0; z<M; z++){
			if(listDna.get(z).length() > 2){
				for(int y=z+1; y<M; y++){
					String first = listDna.get(z);
					String newFirst = solution(first, listDna.get(y));
					if ( newFirst != first){
						listDna.set(z, newFirst);
						listDna.set(y, Integer.toString(z));
					}
				}
				listDna.set(z, Integer.toString(z));
			}
		}
		
		HashSet<String> hs = new HashSet<>(listDna);
		System.out.println(hs.size());
	}
	
	
	public static String solution(String first, String sec){
		StringBuilder newFirst = new StringBuilder();
		for (int x = 0; x < sec.length(); x++) {
            char char1 = first.charAt(x);
            char char2 = sec.charAt(x);
            if (char1 != '.' && char2 != '.' && char1 != char2) {
                return first;
            }
            if (first.charAt(x) == '.') {
                newFirst.append(sec.charAt(x));
            } else {
                newFirst.append(first.charAt(x));
            }
        }
        return newFirst.toString();
	}
	
}

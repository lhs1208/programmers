package softeer;
import java.util.*;

public class dna5_3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//갯수
		int M = scan.nextInt();
		//줄기길이
		int N = scan.nextInt();
		
		String[] listDna = new String[M];
		for(int i=0; i<M; i++){
			listDna[i] = scan.next();
		}
		
		Arrays.sort(listDna);
		
		HashSet<String> hs = new HashSet<>();
		for(int z=0; z<M; z++){
			if(listDna[z].length() > 2){
				for(int y=z+1; y<M; y++){
					String first = listDna[z];
					String sec = listDna[y];
					if(solution(first, sec)){
						if(first.contains(".")){
							listDna[z] = changeFirst(first, sec);
						}
						listDna[y] = Integer.toString(z);
					}
				}
				listDna[z] = Integer.toString(z);
			}
			hs.add(listDna[z]);
		}
		System.out.println(hs.size());
	}
	
	public static boolean solution(String first, String sec){
		for (int x = 0; x < sec.length(); x++) {
            char char1 = first.charAt(x);
            char char2 = sec.charAt(x);
            if (char1 != '.' && char2 != '.' && char1 != char2) {
                return false;
            }
        }
        return true;
	}
	
	public static String changeFirst(String first, String sec){
		StringBuilder newFirst = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '.') {
                newFirst.append(sec.charAt(i));
            } else {
                newFirst.append(first.charAt(i));
            }
        }
        return newFirst.toString();
	}

}

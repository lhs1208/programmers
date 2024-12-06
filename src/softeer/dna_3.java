package softeer;

import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.dom.FilteredStepIterator;

public class dna_3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//갯수
		int M = scan.nextInt();
		//줄기길이
		int N = scan.nextInt();
		
		
		List<String> listDnaOg = new ArrayList<>();
		List<String> listDna = new ArrayList<>();
		List<Integer> answerInt = new ArrayList<>();
		
		for(int i=0; i<M; i++){
			listDnaOg.add(scan.next());
		}
		
		for(int x=0; x<M;x++){
			listDna.clear();
			listDna.addAll(listDnaOg);
			Collections.swap(listDna, 0, x);
			
			for(int z=0; z<M; z++){
				int number  = z;
				String firstDna = listDna.get(z);
				//System.out.println("firstDna >>> "+ firstDna);
				if(firstDna.length() > 2){
					if(z == M-1){
						//System.out.println("last >> "+ listDna.get(z));
						listDna.set(z, Integer.toString(number));
					}else{
						for(int y=z+1; y<M; y++){
							String first = listDna.get(z);
							//System.out.println("z>>" + z +"  first>>> " + first);
							String sec = listDna.get(y);
							//System.out.println("y>>" + y +"  sec  >>> " +sec);
							if(solution(first, sec)){
								//System.out.println("true!!!!");
								listDna.set(z, changeFirst(first, sec));
								listDna.set(y, Integer.toString(number));
							}
						}
						listDna.set(z, Integer.toString(number));
					}
				}
			}
			
			HashSet<String> hs = new HashSet<>();
			for(int a = 0; a<M; a++){
				hs.add(listDna.get(a));
			}
			
			answerInt.add(hs.size());
			////System.out.println(hs.size());
			
		}
//		for(int i=0; i<answerInt.size(); i++){
//			//System.out.println("last answer >> " + answerInt.get(i));
//		}
//		//System.out.println("last answer min>> " + Collections.min(answerInt));
		//System.out.println(Collections.min(answerInt));
		System.out.println(Collections.min(answerInt));
	}
	
	
	
	
	
	public static boolean solution(String first, String sec){
		boolean trueOrFasle = true;
		
		////System.out.println("---------------------------->");
		////System.out.println("hello solution");
		
		for(int x=0; x<sec.length(); x++){
			if(!trueOrFasle){
				////System.out.println(trueOrFasle);
				////System.out.println("----------------------------");
				return trueOrFasle;
			}
			
			if(first.charAt(x) == '.' ||  sec.charAt(x) == '.'){
				////System.out.println("x>>> " + x + "  first check >>> " + first.charAt(x));
			}else if(first.charAt(x) != sec.charAt(x)){
				////System.out.println("sec check1 >>>> " + first.charAt(x));
				////System.out.println("sec check2 >>>> " + sec.charAt(x));
				trueOrFasle = false;
			}
		}
		
		
		////System.out.println(trueOrFasle);
		////System.out.println("----------------------------");
		return trueOrFasle;
	}
	
	public static String changeFirst(String first, String sec){
		String newFirst = "";
		
		//System.out.println(first.length());
		//System.out.println(sec.length());
		
		if(first.length() == sec.length()){
			for(int i=0; i<first.length(); i++){
				if(first.charAt(i) =='.'){
					newFirst += sec.charAt(i);
				}else{
					newFirst += first.charAt(i);
				}
			}
		}
		
		//System.out.println("newFirst>>>" + newFirst);
		return newFirst;
		
	}

}

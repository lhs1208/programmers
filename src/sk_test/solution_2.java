package sk_test;

public class solution_2 {

	
	public static int solution(String[] colors, int[] prices){

		String totalColors = "";
		for(String color : colors){
			totalColors += color;
		}
		
		int[] bweyg = new int[5];
		for(int i=0; i<totalColors.length(); i++){
			char eachColors = totalColors.charAt(i);
			String eachColorsString = String.valueOf(eachColors);
			
			if(eachColorsString.contains("B")) bweyg[0]++;
			else if(eachColorsString.contains("W")) bweyg[1]++;
			else if(eachColorsString.contains("R")) bweyg[2]++;
			else if(eachColorsString.contains("Y")) bweyg[3]++;
			else if(eachColorsString.contains("G")) bweyg[4]++;
		}
		
		
		int totalColorsCount = totalColors.length()/2;
		int same = 0;
		for(int eachColor : bweyg){
			same += eachColor/2;
		}
		int dif = totalColorsCount - same;
		
		//같은옷이 더 쌀때, 같은옷 가격이 두개 사는게 다른옷보다 싸게 되면, 다른옷 한개를 같은옷 두개로 퉁칠수있음.
		int tempCount = prices[1]/prices[0];
		int samePlus = (tempCount/2)*2;
		int difMinus = tempCount/2;
		same = same + samePlus;
		dif  = dif  - difMinus;
		
		int answer = (same*prices[0]) + ( (dif)*prices[1]);
		System.out.println(answer);
		return answer;
	}
	
	
	public static void main(String[] arg){
//		String[] colors = {"RG","WR","BW","GG"};
//		int[] prices = {5000,6000};
		
		String[] colors = {"RG","WR","BW","GG"};
		int[] prices = {2000,6000};
		
//		String[] colors = {"BW","RY","BY"};
//		int[] prices = {9000,10000};
		
//		String[] colors = {"YW","RY","WG","BW"};
//		int[] prices = {7561,8945};
		
		solution(colors,prices);
	}
	
}

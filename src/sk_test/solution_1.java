package sk_test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class solution_1 {

	public static int[] solution(String[] purchase){
		int[] grades = new int[5];
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		HashMap<LocalDate, Integer> purchases = new HashMap<>();
		
		for(String record  : purchase){
			String[] parts = record .split(" ");
			LocalDate date = LocalDate.parse(parts[0], formatter);
			int amount = Integer.parseInt(parts[1]);
			purchases.put(date, amount);
		}
		
		LocalDate start = LocalDate.of(2019, 01, 01);
		LocalDate end = LocalDate.of(2019, 12, 31);
		
		
		while(!start.isAfter(end)){
			
			//최근 30일동안 구매 내역
			int totalAmount = 0;
			//날짜별로 돌아가면서 언제 얼마를 샀는지 현재 날짜에는 어느정도 겹치는지를 계산해 주는 식.
			for(Entry<LocalDate, Integer> entry : purchases.entrySet()){
				LocalDate purchaseDate = entry.getKey();
				int amount = entry.getValue();
				
				// purchaseDate 뒤로 는 모두 false 떨어지게 되어있음. 그러니 2019/01/01 보다 큰 모든 날임.
				// purchaseDate가 start보다 뒤에 있는날이냐? 01일 포함한 모든 이후의 일은 다 false, 저번달 31일부터는 이전의 모든 일은true
				if ( !purchaseDate.isAfter(start) ){
					boolean startDays = purchaseDate.isAfter(start);
					System.out.println(startDays);
				}
				
				// purchaseDate기준으로 30일뒤에인 01/30일까지 유지가 되는것. 
				// 01/30일을 포함한 모든 작은날이 false가 떨어짐.
				// purchaseDate가 start.minusDays(29)보다 앞에있는 날이냐? 30일 포함한 모든 이전의 일은 모두 false, 31일부터 이후의 모든 일은true
				// 01/31은  true가 떨어짐.
				if ( !purchaseDate.isBefore(start.minusDays(29)) ){
					boolean endDays = purchaseDate.isBefore(start.minusDays(29));
					System.out.println(endDays);
				}
				
				//위 두개의 설명을 모두 충족하면 01/01 ~ 01/30 까지를 세어준다.
				if ( !purchaseDate.isAfter(start) && !purchaseDate.isBefore(start.minusDays(29))) {
                    totalAmount += amount;
                }
				
			}
			grades[gradeCheck(totalAmount)]++;
			
			start = start.plusDays(1);
			
		}
		
		System.out.println(Arrays.toString(grades));
		
		return grades;
	}
	
	
	public static int gradeCheck(int amount){
        if (amount >= 100000) return 4; // 다이아몬드
        else if (amount >= 50000) return 3; // 플래티넘
        else if (amount >= 20000) return 2; // 골드
        else if (amount >= 10000) return 1; // 실버
        else return 0; // 브론즈
	}
	
	
	public static void main(String[] args) {
		String[] purchase = {"2019/01/01 5000", "2019/01/20 15000", "2019/02/09 90000"};
		solution(purchase);
	}

}

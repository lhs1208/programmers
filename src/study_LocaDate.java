import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class study_LocaDate {

	
	public static void solution(){
		
		LocalDate temp= LocalDate.of(2019, 01, 01);
		System.out.println(temp);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//Period 객체를 생성해서 넣어서 비교
		Period period = Period.between(temp, now);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		//now와 비교해서 temp가 현재보다 빠르지 적은지 판단해주는 구문.
		//now is after then temp -> is after
		System.out.println(now.isAfter(temp));
		System.out.println(now.isBefore(temp));
		System.out.println(now.isEqual(temp));
		
		System.out.println(temp.minusDays(29)); 
		System.out.println("plus >>>> " + temp.plusDays(30));
		
		

		
		//두 날짜의 일수 차이.
		long betweenDays = ChronoUnit.DAYS.between(temp, now);
		System.out.println(betweenDays);
		// localDateTime으로 연,월,일 뿐만아니라 시간,분,초도 관리 가능
		LocalDateTime temp2 = LocalDateTime.of(2019, 12, 01, 9, 30, 30);
		LocalDateTime temp3 = LocalDateTime.of(2019, 12, 31, 9, 30, 30);
//		System.out.println("localDateTime 비교 시작 >>>> ");
//		System.out.println(ChronoUnit.YEARS.between(temp2, temp3));
//		System.out.println(ChronoUnit.MONTHS.between(temp2, temp3));
//		System.out.println(ChronoUnit.WEEKS.between(temp2, temp3));
//		System.out.println(ChronoUnit.DAYS.between(temp2, temp3));
//		System.out.println(ChronoUnit.HOURS.between(temp2, temp3));
//		System.out.println(ChronoUnit.MINUTES.between(temp2, temp3));
//		System.out.println(ChronoUnit.SECONDS.between(temp2, temp3));
		
		
		
		// self 문제
		// 2019/01/01 ~ 2019/01/30 안에 포함된 날을 구한다. 
		LocalDate purchaseDate = LocalDate.of(2019, 01, 01);
		LocalDate start = LocalDate.of(2019, 01, 30);
		System.out.println("start .minusDays(29) >>> " + start.minusDays(29));
		
		// purchaseDate기준으로 30일뒤에인 01/30일까지 유지가 되는것. 
		// 01/30일을 포함한 모든 작은날이 false가 떨어짐.
		// purchaseDate가 start.minusDays(29)보다 앞에있는 날이냐? 30일 포함한 모든 이전의 일은 모두 false, 31일부터 이후의 모든 일은true
		// 01/31은  true가 떨어짐.
		if ( !purchaseDate.isBefore(start.minusDays(29)) ){
			System.out.println("hi");
		}
		
		// purchaseDate 뒤로 는 모두 false 떨어지게 되어있음. 그러니 2019/01/01 보다 큰 모든 날임.
		// purchaseDate가 start보다 뒤에 있는날이냐? 01일 포함한 모든 이후의 일은 다 false, 저번달 31일부터는 이전의 모든 일은true
		if ( !purchaseDate.isAfter(start) ){
			System.out.println("hi2");
		}
		
		
		if (!purchaseDate.isBefore(start.minusDays(29)) && !purchaseDate.isAfter(start)) {
            System.out.println("test"); 
        }
		
		
		
		//formatter study
		String studyTemp = "2019/12/27";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(LocalDate.parse(studyTemp, formatter));
		
		
	}
	
	
	
	
	public static void main(String[] args){
		solution();
	}
	
	
}

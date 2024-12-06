import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class sample2 {

	static HashSet<String> hs = new HashSet<>();

	
	public static void exam() throws ParseException{
		Date dt = new Date();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        String regDtString = format.format(dt); // date를 string 으로 변환
        Date givenDate = format.parse(regDtString); // string을 date로 변환
        
        LocalDate StartDate = LocalDate.of(2024, 10, 10);
        LocalDate endDate = LocalDate.of(2024, 11, 14);
        
        long between = ChronoUnit.DAYS.between(StartDate, endDate);
        System.out.println(between);
        
	};
	
	
	public static void exam2() throws ParseException{
		
		Date dt = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("hh:mm");
		String temp = format.format(dt);
		
		System.out.println(temp);
		Date temp1 = format.parse(temp);
		
		String time1 = "10:20";
        Date date1 = format.parse(time1);
        long difference = date1.getTime() - temp1.getTime();
        
        int hours = (int) ( (difference/(1000*60)) * 60 );
        int min = (int)   ( (difference/(1000*60)) % 60 );
        
        System.out.println(hours);
        System.out.println(min);
        
	}
	
	
	
	public static void main(String[] args) throws ParseException{
		
		hs.add("w");
		hs.add("s");
		hs.add("w");
		hs.add("W");
		hs.add(" ");
		//System.out.println(hs);

		
		//exam();
		exam2();
		
        
	}

}

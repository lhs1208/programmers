import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.ConstantPushInstruction;


public class sample3 {

	public static void main(String[] args) throws ParseException {
		
		
		Date dt = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		String temp = format.format(dt);
		Date temp2 = format.parse(temp);
		
		/*System.out.println(temp);
		System.out.println(temp2);*/
		
		int temp3 = 1;
		
		int temp4 = 11;
		
		String tempzz =  Integer.toString(temp3);
		String tempzz2 =  Integer.toString(temp4);
		
		
	        int answer = 0;
	        int i=10; int j=50; int k=5;
	        
	        String ccc = "";
	        String fixNum = Integer.toString(k);
	        
	        for(int z=i; z<=j; z++){
	            String myNum = Integer.toString(z);
	            if(myNum.contains(fixNum)){
	                ccc += myNum;
	            }
	            
	        }
	        
	        
	        String ss = ccc.replace(fixNum, "");
	        
	        System.out.println(ccc);
	        System.out.println(ss);
	        
	        System.out.println(ccc.length());
	        System.out.println(ss.length());
	        
	        System.out.println(ccc.length() - ss.length());
	        
	        
	        for(int x=0; x<ccc.length(); x++){
	            if(ccc.substring(x,x+1).contains(fixNum)){
	            	answer++;
	            }
	        }
	        
	        System.out.println(answer);
	        
	        String message = "Let's go!";
	        System.out.println("3"+"\n"+"2\n1");
	        System.out.println(message);
	        
	        
	        ArrayList arr = new ArrayList<>();
	        
	        for(int a  = 0; a<3; a++){
	        	arr.add(a);
	        }
	        arr.add(1);
	        
	        for(int a  = 0; a<4; a++){
	        	System.out.println(arr.get(a));
	        }
	        
	        
	        arr.contains(arr);
	        
	        
	        for(int a  = 0; a<4; a++){
	        	System.out.println("test>> " + arr.get(a));
	        }
	        
	}

	
	
	
	
}

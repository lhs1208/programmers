package softeer;
import java.util.*;

public class lecture_3 {

	 static class Lecture{
        int Si;
        int Fi;
        public Lecture(int Si, int Fi) {
            this.Si = Si;
            this.Fi = Fi;
        }
	 }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lectureCount = scan.nextInt();
		
		List<Lecture> lectureList = new ArrayList<>();
		
		for(int i=0; i<lectureCount; i++){
			int Si = scan.nextInt();
			int Fi = scan.nextInt();
			lectureList.add(new Lecture(Si,Fi));
		}
		Collections.sort(lectureList, (o1,o2)->o2.Fi-o1.Fi);
		int count = 0;
		int prevEndTime = 0;
		
		for(Lecture lecture : lectureList){
			if(lecture.Si >= prevEndTime){
				count++;
				prevEndTime = lecture.Fi;
			}
		}
	}

}

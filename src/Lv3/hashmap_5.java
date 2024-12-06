// 베스트앨범
// https://school.programmers.co.kr/learn/courses/30/lessons/42579

package Lv3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class hashmap_5 {

	 static class Music{
	 	String genre;
        int play;
        int idx;
        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
	 }
	
	 public static int[] solution(String[] genres, int[] plays) {

		HashMap<String, Integer> hm = new HashMap<>();
        for(int z=0;z<genres.length;z++){
        	System.out.println(hm.getOrDefault(genres[z], 0) + plays[z]);
        	hm.put(genres[z], hm.getOrDefault(genres[z], 0) + plays[z]);
        }
        
        ArrayList<String> genresOrd = new ArrayList<>();
        while(hm.size() !=0){
        	int max =-1;
        	String maxKey = "";
        	for(String key:hm.keySet()){
        		int temp = hm.get(key);
        		if(temp > max){
        			max = temp;
        			maxKey = key;
        		}
        	}
        	genresOrd.add(maxKey);
        	hm.remove(maxKey);
        }
        
        ArrayList<Music> result = new ArrayList<>();
        for(String gern : genresOrd){
        	System.out.println("gern>>>" + gern);
        	ArrayList<Music> list = new ArrayList<>();
        	for(int i=0;i<genres.length;i++){
        		if(genres[i].equals(gern)){
        			list.add(new Music(gern, plays[i], i));
        		}
        	}
        	
			Collections.sort(list, (o1,o2)->o2.play-o1.play );

			result.add(list.get(0));
            if(list.size()!=1){
            	result.add(list.get(1));
            }
		}
        
        
        
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
        	answer[i] = result.get(i).idx;
        }
        
        //위 3줄 코드를 아래 로 변경
        result.stream().map(m -> m.idx).toArray();
        
        
        return answer;
    }
	 
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays     = {500, 600, 150, 800, 2500};	
		solution(genres,plays);
	}

}


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class study_Stream {
	
	public static class example{
		int level;
		String name;
		
		//생성자의 이름은 class의 이름과 같아야 한다. 그래야 생성자가 됨
		public example(int level, String name) {
			this.level = level;
			this.name = name;
		}
		
		//class와 이름이 다르기 때문에 얘는 생성자가 아니라 메소드이다.
		//이 메서드를 쓸수있을까? 어떻게 써야할까?
		public void Example(int level, String name){
			System.out.println(level + name);
		}
	}
	
	private static List<example> getExample(){
		List<example> result = new ArrayList<>();
		result.add(new example(9,"장길동"));
		result.add(new example(1,"김길동"));
		result.add(new example(3,"박길동"));
		result.add(new example(2,"이길동"));
		return result;
	}
	
	public static void test(){
		List<example> examples = getExample();
		
		Iterator<example> iter = examples.iterator();
		while(iter.hasNext()){
			example example = iter.next();
			//System.out.println("iterator >>> " + example.level + example.name);
		}
		
		for(example test : examples){
			//System.out.println("for >> " + test.level + test.name);
		}
		
		//stream 리스트에 다 넣기
		List<example> result = examples.stream().collect(Collectors.toList());
		
		//filter 사용
		List<example> result1 = examples.stream().filter(e -> e.level == 9).collect(Collectors.toList());

		//map 사용
		List<String>  result2 = examples.stream().filter(e -> e.level == 1).map(e -> e.name).collect(Collectors.toList());
		
		List<Integer> result3 = examples.stream().map(e -> e.level).sorted().collect(Collectors.toList());
		
		//역순
		List<String> result4 = examples.stream().map(e -> e.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(result4.get(0));
		
	}
	
	public static void main(String[] args) {
		test();
	}

}

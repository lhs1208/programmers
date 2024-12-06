
public class instance {
	
	static class HelloInstance{
		static int age;
		String name;
		public HelloInstance(String name){
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		HelloInstance.age = 10;
        System.out.println(HelloInstance.age);
        HelloInstance helloInstance = new HelloInstance("peter");
        System.out.println(HelloInstance.age);
        String temp = helloInstance.name; 
        System.out.println(temp);
        
        /*----------*/
        helloInstance.age = 20;
        HelloInstance helloInstance2 = new HelloInstance("David");
        String temp2 = helloInstance2.name; 
        System.out.println(temp2);
        System.out.println(HelloInstance.age);
        System.out.println(helloInstance2.age);

	}

}

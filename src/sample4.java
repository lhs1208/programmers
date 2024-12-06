
public class sample4 {

	public static int findRoot(int[][] links){
		
		boolean[] hasParent = new boolean[links.length];
		
        for (int i = 0; i < links.length; i++) {
            for (int child : links[i]) {
            	System.out.println("child >> " + child);
            	if (child != -1) {
                    hasParent[child] = true;
                    System.out.println(hasParent[child]);
                }
            }
        }
		
        // 부모가 없는 노드를 루트로 반환
        for (int i = 0; i < links.length; i++) {
            if (!hasParent[i]) {
                System.out.println(i);
                System.out.println(hasParent[i]);
            	return i; // 루트 노드
            }
        }
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[][] links = {{-1,-1},{-1, -1}, {-1, 0}, {2, 1}};
		
		findRoot(links);
		
	}

}

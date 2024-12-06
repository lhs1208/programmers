//시험장 나누기
//2021 카카오 채용연계형 인턴십
//https://school.programmers.co.kr/learn/courses/30/lessons/81305

package Lv5;

import java.util.Arrays;

public class divideClass {

    static int[] num;          // 각 시험장의 응시자 수
    static int[][] links;      // 트리의 연결 상태
    static int k;              // 그룹의 수
	
	private static int solution(int k, int[] num, int[][] links) {
		divideClass.num = num;
		divideClass.links = links;
		divideClass.k = k;
        
		int left = Arrays.stream(num).max().getAsInt();
		int right =  Arrays.stream(num).sum();
		int root = findRoot(links);
		
		while(left < right){
			int mid = (left + right) /2 ;
			if(canDivide(root,mid)){
				right = mid;
			}else{
				left = mid +1;
			}
		}
		
		return left;
	}
	
	private static boolean canDivide(int root, int maxGroupSize) {
		int[] result = dfs(root, maxGroupSize); 
		return result[1] <= k - 1;
	}

	
	private static int[] dfs(int node, int maxGroupSize) {
		if (node == -1) return new int[]{0, 0};
		int leftChild = links[node][0];
		int rightchild = links[node][1];
		
		int[] leftResult = dfs(leftChild, maxGroupSize);
		int[] rightResult = dfs(rightchild, maxGroupSize);
		
		int sum = num[node] + leftResult[0] + rightResult[0];
		int cuts = leftResult[1] + rightResult[1];
		
		if(sum <= maxGroupSize){
			return new int[]{sum,cuts};
		}
		
        if (num[node] + Math.min(leftResult[0], rightResult[0]) > maxGroupSize) {
            return new int[]{num[node], cuts + 2};
        }
        return new int[]{num[node] + Math.min(leftResult[0], rightResult[0]), cuts + 1};
	}
	

	private static int findRoot(int[][] links) {
		int n = links.length;
		boolean hasParent[] = new boolean[n];
		for(int i=0; i<n; i++){
			for(int child : links[i]){
				if(child != -1){
					hasParent[child] = true;
				}
			}
		}
        for (int i = 0; i < n; i++) {
            if (!hasParent[i]) {
                return i;
            }
        }
		return -1;
	}

	public static void main(String[] args) {
		int k = 4;
		int[] num = {6, 9, 7, 5};
		int[][] links = {{-1,-1},{-1, -1}, {-1, 0}, {2, 1}};
		solution(k, num, links);
	}

}

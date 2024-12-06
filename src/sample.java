import java.util.*;

public class sample {

	public static void main(String[] args) {

		int n = 100000000; // 1억 개의 데이터 생성
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n); // 랜덤으로 데이터 삽입
        }

        Arrays.sort(arr); // 이진 탐색을 위해 정렬

        int target = random.nextInt(n); // 랜덤으로 찾을 데이터 선택

        long startTime = System.nanoTime();
        linearSearch(arr, target); // 선형 탐색 실행
        long endTime = System.nanoTime();
        long linearTime = endTime - startTime;

        startTime = System.nanoTime();
        binarySearch(arr, target); // 이진 탐색 실행
        endTime = System.nanoTime();
        long binaryTime = endTime - startTime;

        startTime = System.nanoTime();
        hashSearch(arr, target); // 해시 탐색 실행
        endTime = System.nanoTime();
        long hashTime = endTime - startTime;

        // 결과 출력
        System.out.println("Linear Search Time: " + linearTime);
        System.out.println("Binary Search Time: " + binaryTime);
        System.out.println("Hash Search Time: " + hashTime);

        // 그래프 출력 등의 작업은 외부 라이브러리를 활용하여 구현할 수 있습니다.
	}
	
	public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int hashSearch(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        return map.getOrDefault(target, -1);
    }
	

}

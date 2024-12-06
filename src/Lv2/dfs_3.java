package Lv2;

import java.util.*;

public class dfs_3 {

	
    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우 이동

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // 시작 위치 (0, 0), 거리 1
        maps[0][0] = 0; // 방문 처리

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (row == n - 1 && col == m - 1) {
                return distance; // 상대 팀 진영에 도착한 경우 거리 반환
            }

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && maps[newRow][newCol] == 1) {
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                    maps[newRow][newCol] = 0; // 방문 처리
                }
            }
        }

        return -1; // 상대 팀 진영에 도착할 수 없는 경우
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

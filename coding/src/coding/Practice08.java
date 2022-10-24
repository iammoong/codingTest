package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];

		String[] st; // 키, 몸무게 입력
		for (int i = 0; i < N; i++) {
			st = br.readLine().split(" ");// 문자열 분리
			arr[i][0] = Integer.parseInt(st[0]); // 몸무게
			arr[i][1] = Integer.parseInt(st[1]); // 키
		} // 키, 몸무게 입력 받을 for 문

		for (int j = 0; j < N; j++) {
			int rank = 1;

			for (int k = 0; k < N; k++) {
				if (j == k) {
					continue;
				} // 키와 몸무게 비교가 어려울 경우
				if(arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]) {
					rank++;
				} // 비교하기
			} //inner for 문

			System.out.print(rank + " ");
		} //outer for 문

	}

}

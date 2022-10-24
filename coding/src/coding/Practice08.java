package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];

		String[] st; // Ű, ������ �Է�
		for (int i = 0; i < N; i++) {
			st = br.readLine().split(" ");// ���ڿ� �и�
			arr[i][0] = Integer.parseInt(st[0]); // ������
			arr[i][1] = Integer.parseInt(st[1]); // Ű
		} // Ű, ������ �Է� ���� for ��

		for (int j = 0; j < N; j++) {
			int rank = 1;

			for (int k = 0; k < N; k++) {
				if (j == k) {
					continue;
				} // Ű�� ������ �񱳰� ����� ���
				if(arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]) {
					rank++;
				} // ���ϱ�
			} //inner for ��

			System.out.print(rank + " ");
		} //outer for ��

	}

}

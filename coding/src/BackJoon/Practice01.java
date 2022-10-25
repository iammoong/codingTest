package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice01 {

	// �ݺ��� �̿��� ���� Ž��
	public static int binarySearch1(int a, int[] arr, int num) {
		int low = 0;
		int high = a - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] >= num) {
				high = mid - 1; // ���� Ž��
			} else {
				low = mid + 1; // ������ Ž��
			}
		}
		return low;
	}

	public static int binarySearch2(int a, int[] arr, int num) {
		int low = 0;
		int high = a - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] > num) {
				high = mid - 1; // ������ Ž��
			} else {
				low = mid + 1; // ���� Ž��
			}
		}
		return low;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		int[] arr = new int[a]; // ���� ���ϱ�
		StringTokenizer st = new StringTokenizer(br.readLine()); // ���� ����

		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // �Է� ���� �� �迭�� �ֱ�
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(binarySearch2(a, arr, num) -binarySearch1(a, arr, num) + " ");
		}
		br.close();
		
		System.out.println(sb.toString());

	}

}

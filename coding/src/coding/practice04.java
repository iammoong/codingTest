package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice04 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" "); // ��Ÿ�� ���� ����
		
		int a = Integer.parseInt(new StringBuilder(strs[0]).reverse().toString()); // ���� �Ųٷ�
		int b = Integer.parseInt(new StringBuilder(strs[1]).reverse().toString());

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		br.close(); // ����
	}
}

package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int count = a; // 연속된 숫자 세기

		for (int i = 0; i < a; i++) {
			String alpha = br.readLine();
			boolean[] arr = new boolean[26];
			for (int j = 0; j < alpha.length(); j++) {
				if (arr[alpha.charAt(j) - 'a'] == false) {
					arr[alpha.charAt(j) - 'a'] = true;
				} else if (j > 0 && alpha.charAt(j) != alpha.charAt(j - 1)) {
					count--;
					break;
				}
			} // 연속된 알파벳인지 검사
		} // 입력 숫자 받기 for
		System.out.println(count);
		br.close();
	}
}

package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice09 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int six = 666;
		int no = 1;

		while (no != N) {
			six++;
			if (String.valueOf(six).contains("666")) {
				no++;
			}
		}
		System.out.println(six);

	}
}

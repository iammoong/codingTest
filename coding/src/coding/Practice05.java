package coding;

import java.io.IOException;

public class Practice05 {
	public static void main(String[] args) throws IOException {

		int time = 0; // ���� �հ�

		while (true) {
			int a = System.in.read();

			if (a < 'A') {
				break; // ����Ű ������ �� break
			} else if (a < 'D') {
				time += 3;
			} else if (a < 'G') {
				time += 4;
			} else if (a < 'J') {
				time += 5;
			} else if (a < 'M') {
				time += 6;
			} else if (a < 'P') {
				time += 7;
			} else if (a < 'T') {
				time += 8;
			} else if (a < 'W') {
				time += 9;
			} else if (a <= 'Z') {
				time += 10;
			}

		} // while��
		System.out.println(time);
	}

}

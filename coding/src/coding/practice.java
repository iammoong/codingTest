package coding;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); // �Է��� ���̽��� ��
		int student = 0; // �л� �� �ʱ�ȭ

		double avg = 0;
		int[] arr = new int[1000];

		for (int i = 0; i < number; i++) {
			student = sc.nextInt();
			int total = 0; // ���� �հ�
			int count = 0; // ����� �Ѵ� �л� �� ����

			for (int j = 0; j < student; j++) {
				arr[j] = sc.nextInt();
				total += arr[j];
			} // �л����� ���� �Է��� ���� ù��° inner for

			avg = (double) total / student;

			for (int k = 0; k < student; k++) {
				if (arr[k] > avg) {
					count++;
				} /// ��� �Ѵ� �л� ���� ���� �ι�° inner for
			}
			System.out.printf("%.3f", 100.0 * count / student);
			System.out.println("%");
		} // outer for��

		sc.close();

	} // main
}

package coding;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); // 입력할 케이스의 수
		int student = 0; // 학생 수 초기화

		double avg = 0;
		int[] arr = new int[1000];

		for (int i = 0; i < number; i++) {
			student = sc.nextInt();
			int total = 0; // 점수 합계
			int count = 0; // 평균이 넘는 학생 수 세기

			for (int j = 0; j < student; j++) {
				arr[j] = sc.nextInt();
				total += arr[j];
			} // 학생수와 점수 입력을 위한 첫번째 inner for

			avg = (double) total / student;

			for (int k = 0; k < student; k++) {
				if (arr[k] > avg) {
					count++;
				} /// 평균 넘는 학생 세기 위한 두번째 inner for
			}
			System.out.printf("%.3f", 100.0 * count / student);
			System.out.println("%");
		} // outer for문

		sc.close();

	} // main
}

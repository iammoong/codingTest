package Programmers.levelOne;

import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�1 : ");
		int a = sc.nextInt();

		System.out.print("���� �Է�2 : ");
		int b = sc.nextInt();

		int max = 0;

		for (int i = 1; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			} // �ִ�����
		}
		int min = (a * b) / max;
		System.out.println("�ִ����� : " + max);
		System.out.println("�ּҰ���� : " + min);
		
		sc.close();

	}

}

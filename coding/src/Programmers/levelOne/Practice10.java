package Programmers.levelOne;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		boolean answer = true;
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int n = x;
		int harshad = 0;
		int sum = 0;
		
		while (n > 0) {
			harshad = n % 10;
			n /= 10;
			sum += harshad;
		} // �� �ڸ��� ���ϱ�

		
		if (x % sum == 0) {
			System.out.println(answer);
		} else {
			System.out.println(!answer);
		} // �ϻ��� ������ �ƴ��� �Ǻ�
		
		sc.close();

	}

}

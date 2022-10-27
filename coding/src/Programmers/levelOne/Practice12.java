package Programmers.levelOne;

import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력1 : ");
		int a = sc.nextInt();

		System.out.print("숫자 입력2 : ");
		int b = sc.nextInt();

		int max = 0;

		for (int i = 1; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			} // 최대공약수
		}
		int min = (a * b) / max;
		System.out.println("최대공약수 : " + max);
		System.out.println("최소공배수 : " + min);
		
		sc.close();

	}

}

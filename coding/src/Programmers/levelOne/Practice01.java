package Programmers.levelOne;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}

		}
		System.out.println(answer);
		sc.close();
	}

}

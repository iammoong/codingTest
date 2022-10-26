package Programmers.levelOne;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sqrt = (long) (Math.sqrt(n));
		if (sqrt * sqrt == n) {
			System.out.println((sqrt + 1) * (sqrt + 1));
		} else {
			System.out.println("-1");
		}

		sc.close();

	}

}

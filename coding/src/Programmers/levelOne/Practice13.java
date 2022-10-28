package Programmers.levelOne;

import java.util.Arrays;
import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		long num = x;
		long[] answer = new long[n];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num += x;
		}
		System.out.println(Arrays.toString(answer));
		sc.close();
	}
}

package Programmers.levelOne;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		String st = String.valueOf(n);
		StringBuilder sb = new StringBuilder(st);
		
		sb = sb.reverse();
		
		String[] arrStr = sb.toString().split("");
		
		int[] answer = new int[sb.length()];
		
		for(int i = 0; i < sb.length(); i++) {
			answer[i] = Integer.parseInt(arrStr[i]);
			System.out.print(answer[i]);
		}
	}

}

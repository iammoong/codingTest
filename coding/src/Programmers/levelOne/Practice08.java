package Programmers.levelOne;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		int n1 = Integer.parseInt(s1);
		sum += n1;

		String s2 = sc.next();
		int n2 = Integer.parseInt(s2);
		sum += n2;
		
		String s3 = sc.next();
		int n3 = Integer.parseInt(s3);
		
		sum += n3;
		System.out.println(sum);
		
		sc.close();

	}

}

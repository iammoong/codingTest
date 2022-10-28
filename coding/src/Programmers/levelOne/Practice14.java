package Programmers.levelOne;

import java.util.Scanner;

public class Practice14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long sum = 0;
		
		if(a > b ) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}
		
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sc.close();
	}

}

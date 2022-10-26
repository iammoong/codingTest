package Programmers.levelOne;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		
		for(i = 2; i < n; i++) {
			if(n % i == 1) {
				break;
			}
		}
		System.out.println(i);
		
		sc.close();
	}

}

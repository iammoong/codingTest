package Programmers.levelOne;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		long n = num;
		
		while (n != 1) {
			
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
				
			}
			
			result++;
			
			if (result == 500) {
				result = -1;
				break;
			}
		} // while
		System.out.println(result);
		sc.close();

	}

}

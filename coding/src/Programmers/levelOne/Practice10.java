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
		} // 각 자리수 더하기

		
		if (x % sum == 0) {
			System.out.println(answer);
		} else {
			System.out.println(!answer);
		} // 하샤드 수인지 아닌지 판별
		
		sc.close();

	}

}

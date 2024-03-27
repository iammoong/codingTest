package day_6;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < N; i ++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int total = a * b;
			
			sum += total;
		}
		sc.close();
		
		if(X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

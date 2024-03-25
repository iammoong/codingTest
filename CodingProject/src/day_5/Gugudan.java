package day_5;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i +" = " + N * i);
		}
	}
}

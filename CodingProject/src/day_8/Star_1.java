package day_8;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.close();
		
		String star = "";
		
		for(int i = 0; i < N; i++) {
			star += "*";
			System.out.println(star);
		}

	}

}

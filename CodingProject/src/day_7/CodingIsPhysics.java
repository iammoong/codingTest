package day_7;

import java.util.Scanner;

public class CodingIsPhysics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		sc.close();
		
		String strLong = ""; 
		for(int i = 1; i <= N; i++) {
			if(i % 4 == 0) {
				strLong += "long ";
			}
		}
		System.out.println(strLong + "int");
	}
}

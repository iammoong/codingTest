package day_3;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		String strNum = Integer.toString(B);
		int[] arrNum = new int[strNum.length()];
		
		for(int i = 0; i < strNum.length(); i++) {
			arrNum[i] = strNum.charAt(i) - '0';
		}
		
		System.out.println(A * arrNum[2]);
		System.out.println(A * arrNum[1]);
		System.out.println(A * arrNum[0]);
		System.out.println(A * B);
		
		
		sc.close();
	}

}

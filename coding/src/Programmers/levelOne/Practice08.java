package Programmers.levelOne;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		int sum = 0;

		
		int cnt = 0;
		String s1 = "2";
		int n1 = Integer.parseInt(s1);
		sum += n1;
		cnt++;
		
		String s2 = "3";
		int n2 = Integer.parseInt(s2);
		sum += n2;
		cnt++;
		
		String s3 = "4";
		int n3 = Integer.parseInt(s3);
		cnt++;
		
		sum += n3;
		System.out.println(sum);
		
		int avg = sum / cnt;
		
		System.out.println(avg);
		
		

	}

}

package Programmers.levelOne;

import java.util.Arrays;
import java.util.Scanner;

public class Practice15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		String[] list = String.valueOf(n).split("");
		Arrays.sort(list);
		StringBuilder sb = new StringBuilder();
		for(String aList : list) {
			sb.append(aList);
		}
		System.out.println(Long.parseLong(sb.reverse().toString()));
		
		
		sc.close();
		
		
	}

}

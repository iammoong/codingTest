package Programmers.levelOne;

import java.util.Arrays;
import java.util.Scanner;

public class Practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scan = sc.next();
		String[] num = scan.split(" ");
		
		int[] nums = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
		
		for(int i =0; i < nums.length; i++) {
		}
		sc.close();
	}
}

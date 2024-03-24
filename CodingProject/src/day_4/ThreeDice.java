package day_4;

import java.util.Scanner;

public class ThreeDice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		sc.close();
		
		if( x != y && x != z && y != z) {
			int max;
			
			if(x > y) {
				
				if(z > x) {
					max = z;
				} else {
					max = x;
				}
			} else {
				if(z > y) {
					max = z;
				} else {
					max = y;
				}
			}
			System.out.println(max * 100);
		} // 모든 수가 다른 경우 if
		else {
			if(x == y && x == z) { // 주사위 3개가 모두 같을 경우
				System.out.println(10000 + x * 1000);
			} 
			else {
				if(x == y || x == z) {
					System.out.println(1000 + x * 100);
				} else {
					System.out.println(1000 + y * 100);
				}
			}
		}  // 주사위 두개 이상 같을 경우 else
	}
}

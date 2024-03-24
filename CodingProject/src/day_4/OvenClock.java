package day_4;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minites = sc.nextInt();
		int clock = sc.nextInt();
		
		sc.close();
		
		int ovenClock = 60 * hour + minites;
		ovenClock += clock;
		
		hour = (ovenClock / 60) % 24;
		
		minites = ovenClock % 60;
		
		System.out.println(hour + " " + minites);
		
	}
}

package day_3;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minutes = sc.nextInt();
		sc.close();
		
		if(minutes - 45 < 0) {
			minutes = 60 + (minutes - 45);
			if(hour == 0) {
				hour = 23;
			} else {
				hour = hour - 1;
			}
			System.out.println(hour + " " + minutes);
		} else {
			System.out.println(hour + " " + (minutes - 45));
		}
	}
}

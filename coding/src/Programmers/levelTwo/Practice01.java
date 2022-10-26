package Programmers.levelTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice01 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			List<Integer> arrInt = new ArrayList<Integer>();
			
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arrInt.add(array[j]);
			} // inner for
			
			Collections.sort(arrInt);
			answer[i] = arrInt.get(commands[i][2] - 1);
			System.out.println(arrInt.get(commands[i][2] - 1));
		} // outer for

		System.out.print(Arrays.toString(answer));
	}

}

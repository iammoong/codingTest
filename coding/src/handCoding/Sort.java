package handCoding;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] arr = {1, 7, 3, 5, 10};
		
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

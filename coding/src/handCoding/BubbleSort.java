package handCoding;

import java.util.Arrays;

public class BubbleSort {
	static int[] nums;

	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					i--;
					break;
				}
			} // 중복 수 제거
		} // 1~ 10 의 난수 발생
		System.out.println("<정렬전>");
		System.out.println(Arrays.toString(nums));

		// 버블정렬
		for (int i = nums.length - 1; i > 0; i--) {
			for (int k = 0; k < i; k++) {
				if (nums[k] > nums[k + 1]) {
					int temp = nums[k];
					nums[k] = nums[k + 1];
					nums[k + 1] = temp;
				} // if
			} // inner for
		} // outer for

		System.out.println("<정렬후>");
		System.out.println(Arrays.toString(nums));

	}

}

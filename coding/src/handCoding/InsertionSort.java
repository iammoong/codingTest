package handCoding;

import java.util.Arrays;

public class InsertionSort {
	static int[] nums;

	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					i--;
					break;
				}
			} // �ߺ��� ���� ����
		}
		System.out.println("<���� ��>");
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] > nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				} // ��������
			}
		}

		System.out.println("<���� ��>");
		System.out.println(Arrays.toString(nums));
	}
}

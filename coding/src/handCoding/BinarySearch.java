package handCoding;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 4, 5, 6, 7 };
		System.out.println("binarySearch : " + binarySearch(arr, 4));
		System.out.println("upperBound : " + upperBound(arr, 4));
		System.out.println("lowerBound : " + lowerBound(arr, 4));
	}

	// 숫자가 중복되지 않는 배열에서 목표 숫자의 인덱스를 찾는다. O(lgN)
	public static int binarySearch(int[] arr, int target) {
		int lo = 0, hi = arr.length;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			System.out.println(hi + ", " + lo + ", " + mid + ", " + target);

			if (arr[mid] <= target) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		return hi;
	}

	// 숫자가 중복된 배열에서, 목표 숫자보다 큰 첫번째 인덱스를 찾는다.
	public static int upperBound(int[] arr, int target) {
		int lo = 0, hi = arr.length;

		while (lo < hi) {
			int mid = (lo + hi) / 2;
			System.out.println(hi + ", " + lo + ", " + mid + ", " + target);
			if (arr[mid] <= target) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}

		return hi;
	}

	// 숫자가 중복된 배열에서, 목표 숫자의 첫 번째 인덱스를 찾는다.
	public static int lowerBound(int[] arr, int target) {
		int lo = 0, hi = arr.length;

		while (lo < hi) {
			int mid = (lo + hi) / 2;
			System.out.println(hi + ", " + lo + ", " + mid + ", " + target);
			if (arr[mid] < target) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}

		return hi;
	}
}

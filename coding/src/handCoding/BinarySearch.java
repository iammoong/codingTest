package handCoding;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 4, 5, 6, 7 };
		System.out.println("binarySearch : " + binarySearch(arr, 4));
		System.out.println("upperBound : " + upperBound(arr, 4));
		System.out.println("lowerBound : " + lowerBound(arr, 4));
	}

	// ���ڰ� �ߺ����� �ʴ� �迭���� ��ǥ ������ �ε����� ã�´�. O(lgN)
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

	// ���ڰ� �ߺ��� �迭����, ��ǥ ���ں��� ū ù��° �ε����� ã�´�.
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

	// ���ڰ� �ߺ��� �迭����, ��ǥ ������ ù ��° �ε����� ã�´�.
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

package coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practice02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int student = 0;
		
		double avg = 0;
		int[] arr = new int[1000];
		
		for(int i = 0; i < number; i++) {
			student = Integer.parseInt(br.readLine());
			int total = 0; // 점수 합계
			int count = 0; // 평균이 넘는 학생 수 세기
			
			for(int j = 0; j < student; j++) {
				arr[j] = Integer.parseInt(br.readLine());
				total += arr[j]; 
			} // 첫번째 inner for
			
			avg = (double)total / student; // 평균
			
			for(int k = 0; k < student; k++) {
				if(arr[k] > avg) {
					count++;
				}
			} // 평균 넘는 학생 세기 위한 두번째 inner for
			
			System.out.printf("%.3f", 100.0 * count / student);
			System.out.println("%");
			
		} // 케이스 값을 받기 위한 outer for
		br.close();
	}
}

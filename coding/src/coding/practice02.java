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
			int total = 0; // ���� �հ�
			int count = 0; // ����� �Ѵ� �л� �� ����
			
			for(int j = 0; j < student; j++) {
				arr[j] = Integer.parseInt(br.readLine());
				total += arr[j]; 
			} // ù��° inner for
			
			avg = (double)total / student; // ���
			
			for(int k = 0; k < student; k++) {
				if(arr[k] > avg) {
					count++;
				}
			} // ��� �Ѵ� �л� ���� ���� �ι�° inner for
			
			System.out.printf("%.3f", 100.0 * count / student);
			System.out.println("%");
			
		} // ���̽� ���� �ޱ� ���� outer for
		br.close();
	}
}

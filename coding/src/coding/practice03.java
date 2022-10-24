package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice03 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine()); // ����Ʈ���̽� ��
		String[] arr = new String[testCase]; // �Է� ���� String �迭 (O/X �� �޾ƾ��ϹǷ�)

		for (int i = 0; i < testCase; i++) {
			arr[i] = br.readLine();
		} // �׽�Ʈ ���̽� �Է� ���� for ��

		for (int j = 0; j < testCase; j++) {
			
			int count = 0; //O ���� ����
			int sum = 0; // ���� ����

			for (int k = 0; k < arr[j].length(); k++) {
				
				if (arr[j].charAt(k) == 'O') { 
					
					count++;	
					
				} else {
					count = 0;
				}
				sum += count; //  ���ӵ� 'O' ���ϱ�
				
			} // O�� ������ ī��Ʈ�ϴ� inner for
			
			sb.append(sum).append('\n'); // ���ڿ��� �������̷� �÷��ִ� StrungBuilder�� append
			
		} // OX�� �Է��� outer for

		System.out.println(sb);
	} // main

}

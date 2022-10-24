package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice03 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine()); // 테이트케이스 수
		String[] arr = new String[testCase]; // 입력 받을 String 배열 (O/X 를 받아야하므로)

		for (int i = 0; i < testCase; i++) {
			arr[i] = br.readLine();
		} // 테스트 케이스 입력 받을 for 문

		for (int j = 0; j < testCase; j++) {
			
			int count = 0; //O 갯수 세기
			int sum = 0; // 점수 총합

			for (int k = 0; k < arr[j].length(); k++) {
				
				if (arr[j].charAt(k) == 'O') { 
					
					count++;	
					
				} else {
					count = 0;
				}
				sum += count; //  연속된 'O' 더하기
				
			} // O의 갯수를 카운트하는 inner for
			
			sb.append(sum).append('\n'); // 문자열을 가변길이로 늘려주는 StrungBuilder의 append
			
		} // OX를 입력할 outer for

		System.out.println(sb);
	} // main

}

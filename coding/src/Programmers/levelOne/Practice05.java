package Programmers.levelOne;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		boolean answer = true;
		String[] arrStr = st.toLowerCase().split(""); // �빮�ڷ� �ҹ��ڷ� �ٲٰ� ���ڸ� �ڸ�
		int pCnt = 0; 
		int yCnt = 0;
		
		for(int i = 0; i < arrStr.length; i++) {
			if(arrStr[i].equals("p")) {
				pCnt++;
			} else if(arrStr[i].equals("y")) {
				yCnt++;
			}
		}
		
		if(pCnt != yCnt) {
			System.out.println(!answer);
		} else {
			System.out.println(answer);
		}
		
		sc.close();

	}

}

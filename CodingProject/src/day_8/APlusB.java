package day_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class APlusB {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(bf.readLine());
			
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(bf.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int num = i + 1;
			
			int sum = A + B;
			bw.write("Case #" +num +": " +A + " + " + B + " = " + sum + "\n");
		}
		bw.flush();
		bw.close();

	}

}

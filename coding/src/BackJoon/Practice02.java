package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Practice02 {

	public static List<String> list = new ArrayList<>(); // ��ġ�ϴ� �̸� �ֱ�
	public static HashSet<String> hash = new HashSet<>(); // �̸� ��� �ֱ�

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// String[] ArrStrs = new String[N]

		for (int i = 0; i < N; i++) {
			// ArrStrs[i] = br.readLine();
			hash.add(br.readLine());
		} // �̸� ����ϱ�.

		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (hash.contains(str)) {
				list.add(str);
			} 
		} // ���� �̸��� �ִٸ� �ٸ� List�� �ֱ�
		
		Collections.sort(list); // ����
		System.out.println(list.size()); // ��ġ�ϴ� �̸� ���� ���(list ������ ���)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //list�� ����ϸ� �迭�� ������ ������ get�� ��
		}
	}
}

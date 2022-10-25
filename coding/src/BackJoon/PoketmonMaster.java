package BackJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PoketmonMaster {

	public static Map<String, String> map = new HashMap<>();
	public static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // �Է��� ���ϸ� ����
		M = Integer.parseInt(st.nextToken()); // ���� ã�� ���ϸ�

		for (int i = 0; i < N; i++) {
			String poketmon = br.readLine(); // ���ϸ� �̸� �Է�
			String number = Integer.toString(i + 1); // ���ϸ� ��ȣ�Է�
			map.put(poketmon, number); // Hashmap�� �ֱ�
			map.put(number, poketmon);
		} // ���ϸ� �̸�, ��ȣ �Է�

		StringBuilder sb = new StringBuilder(M);

		for (int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine()) + "\n");
		} // ���� ������� ���ϸ� ��ȣ, �̸� �Է�
		System.out.println(sb);

	}

}

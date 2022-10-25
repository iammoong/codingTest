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

		N = Integer.parseInt(st.nextToken()); // 입력할 포켓몬 갯수
		M = Integer.parseInt(st.nextToken()); // 내가 찾을 포켓몬

		for (int i = 0; i < N; i++) {
			String poketmon = br.readLine(); // 포켓몬 이름 입력
			String number = Integer.toString(i + 1); // 포켓몬 번호입력
			map.put(poketmon, number); // Hashmap에 넣기
			map.put(number, poketmon);
		} // 포켓몬 이름, 번호 입력

		StringBuilder sb = new StringBuilder(M);

		for (int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine()) + "\n");
		} // 내가 맞춰야할 포켓몬 번호, 이름 입력
		System.out.println(sb);

	}

}

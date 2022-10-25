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

	public static List<String> list = new ArrayList<>(); // 일치하는 이름 넣기
	public static HashSet<String> hash = new HashSet<>(); // 이름 목록 넣기

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// String[] ArrStrs = new String[N]

		for (int i = 0; i < N; i++) {
			// ArrStrs[i] = br.readLine();
			hash.add(br.readLine());
		} // 이름 등록하기.

		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (hash.contains(str)) {
				list.add(str);
			} 
		} // 같은 이름이 있다면 다른 List에 넣기
		
		Collections.sort(list); // 정렬
		System.out.println(list.size()); // 일치하는 이름 갯수 출력(list 사이즈 출력)
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //list만 출력하면 배열로 나오기 때문에 get을 씀
		}
	}
}

package coding;

public class Test1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("123");
		String s = "123";
		sb.append("abc");
		s = s.concat("abc");
		System.out.println(sb + " " + s);

	}
}

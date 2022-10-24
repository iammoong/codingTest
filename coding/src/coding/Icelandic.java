package coding;

class Horse implements Animal1 {
	Long weight = 1200L;

	public void makeNoise() {
		System.out.println("whinny");
	}
}

public class Icelandic extends Horse {
	public void makeNoise() {
		System.out.println("vinny");
	}

	public static void main(String[] args) {
		Icelandic i1 = new Icelandic();
		Icelandic i2 = new Icelandic();
		Icelandic i3 = new Icelandic();
		i3 = i1;
		i1 = i2;
		i2 = null;
		i3 = i1;
	}
}

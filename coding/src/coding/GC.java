package coding;

public class GC {
	private Object oInGC;

	private void doSomethingElse(Object obj) {
		oInGC = obj;
		//3. 이제 oInGC 역시 A를 가르키고 있다.
		//6. 이제 oInGC null을 가졌다.
		//7. 즉 A를 가르키면 두 참조변수 모두 다른 곳을 가르키고 있다.
	}

	public void doSomething() {
		Object o = new Object(); // 1. A를 가르키고 있다.
		
		doSomethingElse(o); // 2. 파리미터로 o 를 넘겼다.
		
		o = new Object();
		// 4. o가 이제 B를 가르킨다.
		
		doSomethingElse(null);
		// 5. 파리미터로 null을 넘겼다.
		// 8. 결과적으로 A를 가르키고 있는 얘들이 없다. GC의 대상이 된다.
		
		o = null;
		// o는 null을 가진다.
	}// 여기에서 o도 GC의 대상이 된다.
	public static void main(String[] args) {
		new GC().doSomething();
	}
}

package coding;

public class GC {
	private Object oInGC;

	private void doSomethingElse(Object obj) {
		oInGC = obj;
		//3. ���� oInGC ���� A�� ����Ű�� �ִ�.
		//6. ���� oInGC null�� ������.
		//7. �� A�� ����Ű�� �� �������� ��� �ٸ� ���� ����Ű�� �ִ�.
	}

	public void doSomething() {
		Object o = new Object(); // 1. A�� ����Ű�� �ִ�.
		
		doSomethingElse(o); // 2. �ĸ����ͷ� o �� �Ѱ��.
		
		o = new Object();
		// 4. o�� ���� B�� ����Ų��.
		
		doSomethingElse(null);
		// 5. �ĸ����ͷ� null�� �Ѱ��.
		// 8. ��������� A�� ����Ű�� �ִ� ����� ����. GC�� ����� �ȴ�.
		
		o = null;
		// o�� null�� ������.
	}// ���⿡�� o�� GC�� ����� �ȴ�.
	public static void main(String[] args) {
		new GC().doSomething();
	}
}

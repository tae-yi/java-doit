package sec05_superkeywordmethod.EX03_SuperMethdo_1;

class A {
	A() {
		System.out.println("A ������");
	}
}

class B extends A {
	B() {
		super();    // �������� �� �����Ϸ��� �ڵ� �߰�(�θ� Ŭ������ ������ ȣ��)
		System.out.println("B ������");
	}
}

class C {
	C(int a) {
		System.out.println("C ������");
	}
}

class D extends C {
	/* �����Ϸ��� �ڵ������߰��� �ִ� ����
	 D() {
	 super();
	 }
	 */
	D() {
		super(3);
	}
}

public class SuperMethod1 {
	public static void main(String[] args) {
		// A ��ü ����
		A aa = new A();
		System.out.println();
		
		// B ��ü ����
		B bb = new B();
		
		
	}

}

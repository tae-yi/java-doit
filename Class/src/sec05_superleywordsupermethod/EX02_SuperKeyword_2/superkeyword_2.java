package sec05_superleywordsupermethod.EX02_SuperKeyword_2;


class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
	
}

class B extends A {
	void abc() {
	System.out.println("BŬ������ abc()");
	}
	void bcd() {
		super.abc();        // �θ� Ŭ���� ��ü�� abc() �޼��� ȣ��
	}
}

public class superkeyword_2 {
	public static void main(String[] args) {
		// ��ü ����
		B bb = new B();
		
		// �޼��� ȣ��
		bb.bcd();
		
	}

}
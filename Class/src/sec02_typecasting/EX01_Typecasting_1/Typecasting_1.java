package sec02_typecasting.EX01_Typecasting_1;

//  Ŭ������ ��� ����
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting_1 {
	public static void main(String[] args) {
		// ��ĳ����(�ڵ� ��ȯ): ĳ���� ������ �������� �� �����Ϸ��� �ڵ����� �߰�
		A ac = (A) new C();  // C �� A ��ĳ���� (�ڵ� ��ȯ)
		B bc = (B) new C();  // B �� A ��ĳ���� (�ڵ� ��ȯ)
		
		B bb = new B();
		A a = (A) bb;        // B �� A ��ĳ���� (�ڵ� ��ȯ)
		
		
		// �ٿ�ĳ����(���� ��ȯ): ĳ������ �� ���� �� (������ �� ���� �߻�)
		A aa = new A();
//      B b = (B) aa;        // A �� B �ٿ�ĳ���� (���� ��ȯ): �Ұ���
//      C c = (C) aa;        // A �� C �ٿ�ĳ���� (���� ��ȯ): �Ұ���
		
		
		// �ٿ�ĳ����(���� ��ȯ): ĳ������ ������ ��
		A ab = new B();
		B b = (B) ab;        // A �� B �ٿ�ĳ���� (���� ��ȯ)
//      C c = (C) ab;        // A �� C �ٿ�ĳ���� (���� ��ȯ): �Ұ���		
		
		B bd = new D();
		D d = (D) bd;        // B �� D �ٿ�ĳ���� (���� ��ȯ)
		
		A ad = new D();
		B b1 = (B) ad;       // A �� B �ٿ�ĳ���� (���� ��ȯ)
		D d1 = (D) ad;       // A �� D �ٿ�ĳ���� (���� ��ȯ)
	}

}

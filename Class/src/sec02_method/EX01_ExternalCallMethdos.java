package sec02_method;

//Ŭ������ ����
class A {
	// ���� Ÿ�� void, �Է¸Ű����� ����.
	void print() {
		System.out.println("�ȳ�");
	}
	
	
	// ���� Ÿ�� int, �Է¸Ű����� ����.
	int data() {
		return 3;
	}
	
	
	// ���� Ÿ�� double, �Է¸Ű����� 2��
	double sum(int a, double b) {
		return a + b;
	}
	
	//���� Ÿ�� void, ���ο� ���� ���� (�Լ��� ������)
	void printMonth(int m) {
		if (m < 0 || m > 12) {
			System.out.println("�߸��� �Է�");
			return;
		}
		System.out.println(m + "���Դϴ�.");
	}
	
}

public class EX01_ExternalCallMethdos {
	public static void main(String[] args) {
		//��ü ����
		A a = new A();
		// �޼��� ȣ�� (��� Ȱ��)
		a.print();
		int k = a.data();
		a.data();
		System.out.println(k);
		double result = a.sum(3, 5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
	}

}

package sec01_packageimport.EX01_packageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {
		//��ü ����
		// A a = new A();    // ����
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
	
		// ��� Ȱ��
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
	

}


package sec01_packageimport.EX01_packageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {
		//°´Ã¼ »ý¼º
		// A a = new A();    // ¿À·ù
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
	
		// ¸â¹ö È°¿ë
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
	

}


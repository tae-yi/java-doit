package TEST2;

public class MethodsOfString_1 {
	public static void main(String[] args) {
		String str1 = "Hello Java!";
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		System.out.println(str1.charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.indexOf('a', 8));
		System.out.println(str1.lastIndexOf('a',8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str2.indexOf("�ϼ���"));
		System.out.println(str2.lastIndexOf("�ϼ���"));
		System.out.println(str1.indexOf("Bye"));
		System.out.println(str2.lastIndexOf("�����ϴ�."));
		System.out.println();
		
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
		
		
		
		
		
	}

}

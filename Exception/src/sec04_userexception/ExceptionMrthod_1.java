package sec04_userexception;

public class ExceptionMrthod_1 {
	public static void main(String[] args) {
		
		// 1. ���� ��ü�� �������� �� �޽����� �������� �ʾ��� ���
		try {
			throw new Exception();    // ���� �߻�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 2. ���� ��ü�� �������� �� �޽����� �������� ���
		try {
			throw new Exception("���� �޽���");  //���� �߻�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

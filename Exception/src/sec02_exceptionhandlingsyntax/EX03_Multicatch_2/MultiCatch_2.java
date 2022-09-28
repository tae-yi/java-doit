package sec02_exceptionhandlingsyntax.EX03_Multicatch_2;

public class MultiCatch_2 {
	public static void main(String[] args) {
		/*
		 // 1. catch ����� ������ �߸����� ��
		  try {
		  system.out.println(3 / 1);
		  int num - Integer.parseInt("10A");
		  }
		  catch (Exception e) {
		  system.out.println("���ڴ� 0���� ���� �� �����ϴ�.")
		  }
		  catch (NumberFormException e) {
		  system.out.println("���ڷ� �ٲ� �� �����ϴ�.);
		  }
		  finally {
		  system.out.println("���α׷� ����")
		  }
		 */
		// 2. catch ����� �ùٸ� ����
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch (NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		}
		catch (Exception e) {
			System.out.println("���ڴ� 0���� ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("���α׷� ����");
		}
	}
}


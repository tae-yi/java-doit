package question;

public class sum {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i=1; i <=N; i++) {
			sum += i;
			System.out.printf("i: %d, sum: %d\n", i, sum);
		}
	}

}

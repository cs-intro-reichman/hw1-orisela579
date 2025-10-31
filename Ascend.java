// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim) + 1;
		int b =(int) (Math.random() * lim) + 1;
		int c =(int) (Math.random() * lim)+ 1;
		int small = Math.min(a, b);
		small = Math.min(small, c);
		int big = Math.max(a, b);
		big = Math.max(big, c);
		int middle = a + b + c - big -small;


		System.out.println(a + " " + b + " " + c);
		System.out.println(small + " " + middle + " " + big);

		// Replace this comment with your code
	}
}

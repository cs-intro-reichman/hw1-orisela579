// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int h = num / 100;
		int t = num / 10 % 10;
		int o = num % 10;
		System.out.println(h + " hundreds, " + t + " tens, and " + o + " ones.");
	    // Replace this comment with your code
	}
}

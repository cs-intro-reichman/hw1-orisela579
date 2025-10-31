// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		int currentvalue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double futurevalue = currentvalue * Math.pow(rate * 0.01 + 1, n);
		System.out.println("After " + (int) n + " years, $" + currentvalue + " saved at " + rate + 
							"% will yield $" + (int)futurevalue);
		// Replace this comment with your code
	}
}
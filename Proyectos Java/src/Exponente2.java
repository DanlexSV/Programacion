
public class Exponente2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 6;
		int exp = 2;
		double result = CalculatePower(num,exp);
		System.out.println(num+"^"+exp+"="+result);
	}
	static double CalculatePower (int num, int exp) {
		return Math.pow(num, exp);	
	}
	
}

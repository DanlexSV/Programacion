
public class Exponentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int exp = 3;
		double result = CalculatePower(num,exp);
		System.out.println(num+"^"+exp+"="+result);
	}
	static double CalculatePower (int num, int exp) {
		return Math.pow(num, exp);	
	}

}

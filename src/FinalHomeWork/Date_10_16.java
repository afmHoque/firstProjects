package FinalHomeWork;


public class Date_10_16 extends Calculation{
	
	public void multiplication(int x, int y) {
		
		z = x*y;
		System.out.println("the sum of the given number is:" +z);
		
	}
	public static void main(String[] args){
		
		int a = 20;
		int b = 30;
		
		Date_10_16 D = new Date_10_16();
		
		
		D.addition(a, b);
		D.Subtraction(a, b);
		D.multiplication(a, b);
		
	}
		
	}
	




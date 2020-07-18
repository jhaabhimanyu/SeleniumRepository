
public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		int c;
		
		System.out.println("Previous value of a is"+a+"Previous value of b is"+b);
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Current value of a is"+a+"Current value of b is"+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Current value of a is"+a+"Current value of b is"+b);
		

	}

}

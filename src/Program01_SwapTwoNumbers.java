
public class Program01_SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//Approach 1: 3rd variable 
		int c=a;
		a=b;
		b=c;
		System.out.println(b +" "+a);
		System.out.println("value of b "+b);
		
		//Approach 2
		b=a+b-(a=b);
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		
		//Approach 3
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		
		//Approach 4
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
	}
}

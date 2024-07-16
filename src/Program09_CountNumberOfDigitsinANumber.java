import java.util.Scanner;

public class Program09_CountNumberOfDigitsinANumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number"); //123456
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0) {
			num =num/10;
			count++;
			
		}
		System.out.println(count);
		
		
	}
	
}

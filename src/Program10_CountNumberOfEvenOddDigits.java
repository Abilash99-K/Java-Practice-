import java.util.Scanner;

public class Program10_CountNumberOfEvenOddDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); // storing the number
		int evencount=0;
		int oddcount=0;
		while(num!=0) {
			int val=num%10;
			if(val%2==0) {
				evencount++;
				
			}else {
				oddcount++;
			}
			num=num/10;
		}
        System.out.println(evencount);
        System.out.println(oddcount);
	}

}

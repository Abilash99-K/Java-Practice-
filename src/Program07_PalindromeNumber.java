import java.util.Scanner;

public class Program07_PalindromeNumber {
	
	//A Palindrome number is number that remains the same when its digits are reversed 
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int orgNum=num;
	    int rev=0;
	    
	    while(num!=0) {
	    	rev=num%10+rev*10;
	    	num=num/10;	
	    }
	    if(orgNum==rev) {
	    	System.out.println("palindrome number"+rev);
	    	
	    }else {
	    	System.out.println("Not a palindrome number "+rev);
	    }
	    
		
	}
	
}

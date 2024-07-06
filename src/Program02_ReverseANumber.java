import java.util.Scanner;

public class Program02_ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number:");//1234
		int  num = sc.nextInt();  
		int rev=0;
		while(num!=0) {
			
		 rev=num%10+rev*10;
		 num=num/10;
		}
	    
	     System.out.println(rev);
	     
	     StringBuffer sb= new StringBuffer(String.valueOf(num));
	     StringBuffer reve=sb.reverse();
	     
	     System.out.println(reve);

	}
	

}

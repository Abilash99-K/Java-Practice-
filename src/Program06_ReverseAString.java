
public class Program06_ReverseAString {

	public static void main(String[] args) {
		
		String str="Selenium";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i); 
		}
	      
		System.out.println("Reverse String"+" "+rev);
		
	// approach 2
		char a[]=str.toCharArray();
		int len=a.length; 
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse String"+" "+rev);	
	}

}

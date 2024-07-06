
public class Program05_FindMaxMinInArray {
	public static void main(String[] args) {
		
		
		int a[]= {5,12,8,10,6,3,4,19};
		 int max = a[0];
	        int min = a[0];
	        
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] > max) {
	                max = a[i];
	            }
	            if (a[i] < min) {
	                min = a[i];
	            }
	        }
	        
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	        System.out.println("Array length: " + a.length);
	    }
	}
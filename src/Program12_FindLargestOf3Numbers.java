import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Program12_FindLargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number 1:");
		int num1=sc.nextInt();
		System.out.println("enter number 2:");
		int num2=sc.nextInt();
		System.out.println("enter number 3:");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 Largest");
		}else if (num2>num1 && num2>num3) {
			System.out.println("num2 Largest");
		}else {
			System.out.println("num 3 largest");
		}
		

	}

}

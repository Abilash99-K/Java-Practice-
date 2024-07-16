
public class Program03_Swapthreenumbersincycle {

	public static void cyclicSwap(int[] arr) {
        // Before overwriting arr[1], store its value in temp.
        int temp = arr[1];
 
        // Now do required swapping starting with arr[1].
        arr[1] = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
    }
 
    public static void main(String[] args) {
        int a = 2, b = 4, c = 7;
        int[] arr = {a, b, c};
 
        System.out.println("Value before swapping:");
        System.out.println("a = " + arr[0] + "\nb = " + arr[1] + "\nc = " + arr[2]);
 
        cyclicSwap(arr);
 
        System.out.println("Value after swapping:");
        System.out.println("a = " + arr[0] + "\nb = " + arr[1] + "\nc = " + arr[2]);
        
    }
}


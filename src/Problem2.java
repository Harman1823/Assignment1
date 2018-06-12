import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		int[] a = {3,	8,	9,	7,	6};
		Scanner obj=new Scanner(System.in);
		System.out.println("Shift array :");
		int rotateBy  = obj.nextInt();
		obj.close();
		getRotatedArray(a,rotateBy);
	}

	 static void getRotatedArray(int[] a, int rotateBy) {
		int[] b = new int[rotateBy];
		
		for (int i = 0; i < rotateBy; i++) {
			b[i] = a[i];
		}
		
		for(int i = 0; i < a.length-rotateBy; i++) {
			a[i] = a[i+rotateBy];
		}
		
		for (int i = 0; i < b.length; i++) {
			a[a.length-rotateBy+i] = b[i];
		}		
		System.out.println("Array rotated by "+rotateBy+" is : "+Arrays.toString(a));
	}
}

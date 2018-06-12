import java.util.Scanner;

public class Problem3 {
	    public int candiesAte(int N, int M) {
	    	System.out.println("Total number of Candies: "+N);
	        int[] X = new int[N];
	        int i = 0;
	        int count = 0;
	        while(X[i] == 0) {
	            X[i] = 1;
	            System.out.println(i);
	            //System.out.println( i = (i + M));
	            i = (i + M) % N ;  
	            count++;
	        }
	        return count;
	    }
	    public static void main(String[] args) {
			Scanner obj1=new Scanner(System.in);
			System.out.println("Enter the number of candies: ");
			int N =obj1.nextInt();
			System.out.println("Enter M : ");
			int M =obj1.nextInt();
			obj1.close();
			
	    	Problem3 obj=new Problem3();
	    	int num=obj.candiesAte(N, M);
	    	System.out.println("Number of Candies you ate: "+num);
		}
	}
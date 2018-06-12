import java.util.Arrays;

public class Problem1 {
	
	String SortAraay(String[] strarray) {
		
	 Arrays.sort(strarray);

	 for(int i=0;i<strarray.length;i++) {
		 
		 if(strarray[i].startsWith("x")) {
			
			 System.out.println("     >>>   "+strarray[i]+"   <<<");
			 
			 			 }
	 }
	 
	 String str=Arrays.toString(strarray);
	 
	return  str ;
		
	}

	public static void main(String[] args) {
		System.out.println("   Words start from x are: ");
		Problem1 obj = new Problem1();
		String[] strarray = new String[] { "mile",	"xylo",	"apple",	"xavier",	"aar"};
		String unsorted=Arrays.toString(strarray);
		String result=obj.SortAraay(strarray);
		System.out.println("\nInput Array : "+unsorted);
		System.out.println("\nSorted Array: "+result);
		
		
	}
	
}

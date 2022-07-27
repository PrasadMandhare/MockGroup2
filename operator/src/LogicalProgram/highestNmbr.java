package LogicalProgram;

import java.util.Arrays;

public class highestNmbr {
	
	public static void main(String[] args) {
		
		int ar [] = {10,40,20,90,60};          //find 3rd highest nmbr
		int a = ar.length-1;
		int b = a;
		
		Arrays.sort(ar);
		
		b=a-2;                         
		System.out.println(ar[b]);
	}

}

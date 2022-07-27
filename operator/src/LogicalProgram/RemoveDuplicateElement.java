package LogicalProgram;

import java.util.Arrays;

public class RemoveDuplicateElement {
	
	public static void main(String[] args) {
		
	int ar [] = {11,12,13,14,11,12};
	Arrays.sort(ar);
	int b = ar.length-1;
	b=removeduplicates(ar,b);
	for(int i=0; i<=b; i++) {
		System.out.println(ar[i]);
	}

	}

	private static int removeduplicates(int[] ar, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}

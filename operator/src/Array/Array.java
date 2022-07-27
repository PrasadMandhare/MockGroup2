package Array;

public class Array {
	public static void main(String[] args) {
		
		String a [] = new String [7];   //Array Declaration
		
		a[0] = "PRASAD"; 
		a[1] = "POONAM";
		a[2] = "PANKAJ"; 	
		a[3] = "SHIVANI"; 
		a[4] = "ABHINAV"; 
		a[5] = "KARTIK"; 
		a[6] = "ADITYA"; 
		//a[7] = "SWITI";
		
		System.out.println(a[0]);
		
		System.out.println("-------------------------------------------");
		
		for (int i=0;i<=6;i++) {
			System.out.println(a[i]);
		}

	}

}

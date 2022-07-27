package LogicalProgram;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int i=0;
		int count;
		int j;
		
		for(i=1; i<=100; i++) {
			count = 0;
			for(j=1;j<=i; j++) {
				if(i%j==0)
				count++;
			}
			if(count==2) { 
				System.out.println(i);
			}
		
		//if(i==8) {
	//	System.out.println("Prime number");
	//}
//	else {
	//	System.out.println("not prime number");
	//}
	}	

		}
}

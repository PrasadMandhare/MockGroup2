package Stringmethods;

public class Fibonanci {        //0 1 1 2 3 5 8 13 21 
	                            //a b c d e
	
	
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+" "+b);
		
		for (int i=1;i<=10;i++) {
			
			c=a+b;
			System.out.print(" "+c);
			a=b;  //a=1
			b=c;  //b=1
		}
	}

}

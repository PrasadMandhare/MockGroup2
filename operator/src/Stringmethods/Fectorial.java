package Stringmethods;

public class Fectorial {
	public static void main(String[] args) {    //5!=5*4*3*2*1
		
		int a=5;
		int fact=1;
		
		for(int i=5;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}

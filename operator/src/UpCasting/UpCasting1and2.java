package UpCasting;

public class UpCasting1and2 {
	
	public static void main(String[] args) {
		
		 UpCasting1 x = new  UpCasting2();         //UpCasting 
		 x.demo();
		 x.test();
		 
		 UpCasting2 y = new  UpCasting2();
		 y.demo();
		 y.test();
		 y.m1();
	}

}

package CastImplicit;

public class Explicit {            //higher to low
	
	public static void main(String[] args) {
		
		double a=143.55;
		System.out.println(a);
		
		int b= (int) a;
		System.out.println(b);
		
		byte c= (byte) b;
		System.out.println(c);
	}

}

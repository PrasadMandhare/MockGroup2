package Stringmethods;

public class JoinSplit {
	
	public static void main(String[] args) {
		
		String s1 = "velocity ";
		String s2 = "VELOCITY ";
		String s3 = "abcd ";
		
		String a = String.join(s3,s1,s2);
		System.out.println(a);
	}

}

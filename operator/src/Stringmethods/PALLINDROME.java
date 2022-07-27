package Stringmethods;

public class PALLINDROME {
	
	public static void main(String[] args) {
		
		String a = "MADAM";     
		String rev = "";
		
		for (int i = a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i) ;
			
		}
		System.out.println(rev);    //MADAM
		
		if (a.equals(rev)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
		}
	}

}

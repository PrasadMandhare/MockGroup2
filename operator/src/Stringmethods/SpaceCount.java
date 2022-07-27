package Stringmethods;

public class SpaceCount {
	
	public static void main(String[] args) {
		
		String a = "   PRASAD   POOJA   AKASH   SHIV";
		int count = 0;
		
		for (int i=2;i<=a.length()-1;i++) {
			
			char b=a.charAt(i);
			if (b==' ') {
				count++;
			}
		}	
			System.out.println(count);
		
	}

}

package globallocale;

public class globleLocale {
	
	int p = 11;          //globle variable
	
	public void demo() {
		int s=18;         //locale variable
		System.out.println(p);
		System.out.println(s);
	}
	public void demo1() {
		int q=20;         //locale variable
		System.out.println(p);
		//System.out.println(s);
		System.out.println(q);
	}
	public static void main(String[] args) {
		
		globleLocale x = new globleLocale();
		x.demo();
		x.demo1();
	}

}

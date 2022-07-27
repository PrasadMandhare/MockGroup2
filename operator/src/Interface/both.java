package Interface;

public class both implements Interface , interface1 {
	
	public void add() {
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		System.out.println(c);
		
	}
	public void sub() {
		int d =b-a;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		both x = new both();
		x.add();
		x.sub();



	}

}

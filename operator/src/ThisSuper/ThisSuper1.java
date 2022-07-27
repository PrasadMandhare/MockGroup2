package ThisSuper;

public class ThisSuper1 extends ThisSuper {
	
	int p = 30;
	
	public void demo() {
		
		System.out.println(this.p);
		System.out.println(super.p);
	}
	
	public static void main(String[] args) {
		
		ThisSuper1 x = new ThisSuper1();
		x.test();
		x.demo();
			
		
	}

}

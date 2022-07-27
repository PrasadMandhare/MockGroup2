package ThisSuper;

public class ThisSuper  {
	
	int p= 18;
	
	public void test() {
		int p = 20;
		System.out.println(p);
		System.out.println(this.p);
		//System.out.println(super);
	}
	public static void main(String[] args) {
		
	ThisSuper x = new ThisSuper();
	x.test();
		
		
		
	}

}

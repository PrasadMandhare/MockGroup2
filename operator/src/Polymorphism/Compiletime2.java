package Polymorphism;

public class Compiletime2 {
	
	static int a=10;
	int b=20;
	
	public void variable() {
		int c=a+b;
		System.out.println(c);
	}
	public static void variable(int s) {
		Compiletime2 x = new Compiletime2();
		int d=s+x.a;
		System.out.println(d);
	}
	public void variable(int a, int c, int w) {
		int q=c+w*b;
		System.out.println(q);
	}
	public static void main(String[] args) {
		Compiletime2 x = new Compiletime2();

		x.variable();
		variable(100);
		x.variable(100,200,300);
		
	}

}

package Polymorphism;

public class Compiletime {
	static int a=10;
	static int b=20;
	
	public static void Variable() {
		int c=a+b;
		System.out.println(c);
	}
	public static void Variable(int a) {
		int d=a-b;
		System.out.println(d);
	}
	public static void Variable(int a, int b) {
		int e=a*b;
		System.out.println(e);
	}
	public static void Variable(int a, int b, int c) {
		int f=a+b*c;
		System.out.println(f);
	}
	public static void main(String[] args) {
		Variable();
		Variable(500);
		Variable(11,18);
		Variable(100,200,300);
	}

}

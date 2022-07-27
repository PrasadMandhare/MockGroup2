
package constructor;

public class test {
	
	int p;
	int q;
	int r;
	
	test(){
		p=40;
		q=20;
	}
	test(int a, int b){
		p=a;
		q=b;
	}
	test(int a, int b, int c){
		p=a;
		q=b;
		r=c;
	}
	public void addition( ) {
		System.out.println(p+q+r);
	}

}

package staticnonstatic;

public class staticnonstatic {
	
	static int p=11;
	       int s=18;
	       
	       staticnonstatic() {
	    	   p=20;
	    	   s=30;
	       }
	       
	       staticnonstatic(int m) {
	    	   p=40;
	    	   s=60;
	       }
	       staticnonstatic(char a) {
	    	   
	       }
	       
	       public static void main(String[] args) {
			System.out.println(p);
			//System.out.println(s);
			
			
			staticnonstatic x = new staticnonstatic();
			System.out.println(p);
			System.out.println(x.s);
			
			staticnonstatic y = new staticnonstatic(29);
			System.out.println(p);
			System.out.println(y.s);
			
			staticnonstatic z = new staticnonstatic('$');
			System.out.println(p);
			System.out.println(z.s);
		}

}

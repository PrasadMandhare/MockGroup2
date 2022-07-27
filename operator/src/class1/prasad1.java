package class1;

public class prasad1 {
	
	public static void main (String [] args)  {

		int a =154;
		int c = a;
		int sum = 0;

		while (a>0) {
		int b = a%10;
		sum=sum+(b*b*b);
		a=a/10;
		}

		if(c==sum) {
		System.out.print("No is armstrong");
		}
		else{
		System.out.print("No is not armstrong");
		}

	}
}

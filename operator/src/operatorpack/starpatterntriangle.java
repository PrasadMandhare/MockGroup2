package operatorpack;

public class starpatterntriangle {
	
	public static void main(String[] args) {
		int space=4;
		int star=1;
		
		for(int s=1; s<=5; s++) {
			for(int p=1; p<=space; p++) {
				System.out.print(" ");
			}
			for(int m=1; m<=star; m++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}

}

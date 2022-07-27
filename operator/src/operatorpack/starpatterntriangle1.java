package operatorpack;

public class starpatterntriangle1 {
	public static void main(String[] args) {
		int star=1;
		int space=4;
		
		for(int s=1; s<=5; s++) {
			for(int p=1; p<=space; p++) {
				System.out.print(" ");
			}
			for(int m=1; m<=star; m++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}

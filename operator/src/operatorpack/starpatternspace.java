package operatorpack;

public class starpatternspace {
	public static void main(String[] args) {
		
		int star=1;
		for(int s=1; s<=5; s++) {
			for(int p=1; p<=star; p++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}

}

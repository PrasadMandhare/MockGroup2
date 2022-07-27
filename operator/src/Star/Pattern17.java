package Star;

public class Pattern17 {
	
public static void main(String[] args) {
		
		for(int row =1; row<=5; row++) {
			for(int col=1; col<=9; col++) {
				if((row==5)||(row+col==6)||(col-row==4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

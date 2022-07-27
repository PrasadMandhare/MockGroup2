package operatorpack;

public class nestedif {
	
	public static void main(String[] args) {
		
		String mailid = "PS";
		String pass = "PS11";
		
		if (mailid == "PS") {
			System.out.println("Mail ID is correct");
			
			if (pass == "PS11") {
				System.out.println("Password is correct");
				System.out.println("logon successful");
			}
			else {
				System.out.println("Password is incorrect");
				System.out.println("login failed");
			}
		}
		else {
			System.out.println("Mail ID is incorrect");
			System.out.println("login failed");
		}
	}

}

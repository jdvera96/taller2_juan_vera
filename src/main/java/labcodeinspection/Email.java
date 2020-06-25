package labcodeinspection;

public class Email {

	private static  String m_firstName; 
	private static String m_lastName;
	private static String pass;
	private static String department;
	private static int defaulPassLength = 8;
	private static String email;

	/**
	* 
	*
	* @author Juan Vera
	*/
	public Email(String firstName, String lastName) { 
		Email.m_firstName = firstName;
		Email.m_lastName = lastName;
	}

	/**
	* 
	*
	* @author Juan Vera
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + pass);
	}

	/**
	* 
	*
	* @author Juan Vera
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) { //NOPMD
		case 1:
			Email.department = "sales";
			break;
		case 2:
			Email.department = "dev";
			break;
		case 3:
			Email.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	
	/**
	* 
	*
	* @author Juan Vera
	*/
	public void generateEmail() {
		Email.pass = this.randomPassword(Email.defaulPassLength);
		Email.email = Email.m_firstName + Email.m_lastName + "@" + Email.department
				+ ".espol.edu.ec";
	}
}

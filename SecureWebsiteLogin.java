public class SecureWebsiteLogin extends SecureItem {
	public String username; 
	public String password;

	// Constructor
	public SecureWebsiteLogin (String aName, String theUsername, String thePassword) {
		super(aName); 
		username = theUsername;
		password = thePassword;
	}

	@Override
	public String display() {
		return "Website: " + name + "\nUsername: " + username + "\nPassword: ******"; // no password
	}

	@Override
	public String reveal() {
		return "Website: " + name + "\nUsername: " + username + "\nPassword: " + password; // password revealed
	}

	@Override
	public String encrypted() {
		return "Website: " + name + "\nUsername: " + username + "\nPassword: " + crypto.encrypt(password); // crypto.encrypted (password)
	}
}
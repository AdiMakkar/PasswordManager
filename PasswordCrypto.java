public class PasswordCrypto implements Crypto {
	
	public static int offset;
	private String cryptString;

	// Constructor
	public PasswordCrypto(String cryptString) {
		offset = 0;
		this.cryptString = cryptString; 
	}

	public static int calculateOffset(String cr) {
		for (int i = 0; i < cr.length(); i++) {
			offset = offset + (cr.charAt(i) - 96);
		}
		if (offset == 0) {
			offset = 10;
		}
		return offset;
	}

	public int getOffset(String cr) {
		return offset;
	}

	// encrypts
	public String encrypt (String message) {
		String result = "";
		calculateOffset(result);
		for (int i = 0; i < message.length(); i++) {
			char blub = (char)((int) message.charAt(i) + offset); // ASCII
			result = result + blub;
		}
		return result;
	}

	// decrypts
	public String decrypt (String message) {
		String result = "";
		calculateOffset(result);
		for (int i = 0; i < message.length(); i++) {
			char blub = (char)((int) message.charAt(i) - offset); // ASCII
			result = result + blub;
		}
		return result;
	}

}
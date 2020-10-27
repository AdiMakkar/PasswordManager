public class CaesarCrypto implements Crypto {
	
	int offset;

	public int getOffset() {
		return offset;
	}

	// encrypts
	public String encrypt (String message) {
		String result = "";
		int switched = getOffset();
		for (int i = 0; i < message.length(); i++) {
			char blub = (char)((int) message.charAt(i) + switched); // ASCII
			result = result + blub;
		}
		return result;
	}

	// decrypts
	public String decrypt (String message) {
		String result = "";
		int switched = getOffset();
		for (int i = 0; i < message.length(); i++) {
			char blub = (char)((int) message.charAt(i) - switched); // ASCII
			result = result + blub;
		}
		return result;
	}	
}
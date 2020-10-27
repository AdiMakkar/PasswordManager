public class ZeroCrypto implements Crypto {
	
	// encrypts.
	@Override
	public String encrypt (String message) { 
		return message;
	}

	// decrypts.
	@Override
	public String decrypt (String message) {  
		return message;
	}
}
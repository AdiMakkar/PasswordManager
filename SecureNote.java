public class SecureNote extends SecureItem {
	
	public SecureNote (String name, String theText) {
		super (name);
		this.text = theText;
	}

	private String text; 

	@Override
	public String display() {
		return this.name + ": ******";
	}

	@Override
	public String reveal() {
		return super.name + ": " + this.text;
	}

	@Override
	public String encrypted() {
		String result = this.crypto.encrypt(text);
		return super.name + ": " + result;
	}
}
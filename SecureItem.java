public abstract class SecureItem {
	
	public String name;
	protected Crypto crypto;

	public SecureItem (String aName) {
		this.name = aName;
	}

	public void setEncryption (Crypto aCrypto) {
		crypto = aCrypto;
	}

	public abstract String display();
	public abstract String reveal();
	public abstract String encrypted();

	protected int compareTo(SecureItem compareTo) {
		return this.name.compareTo(compareTo.name);
	}

}
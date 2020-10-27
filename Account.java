import java.util.*;

public class Account {
	
	Crypto crypto;
	List <SecureItem> items;

	public Account (String aPassword) {
		crypto = new PasswordCrypto(aPassword);
		items = new ArrayList<SecureItem>();
	}

	public SecureItem getItem (int position) {
		return items.get(position - 1);
	}

	public Iterable<SecureItem> items() {
		return items;
	}

	public void addSecureItem (SecureItem item) {
		item.setEncryption(crypto);
		items.add(item);
	
	}

	public void changePassword(String newPassword) {
		crypto = new PasswordCrypto(newPassword);
		for (SecureItem initial:items()) {
			initial.setEncryption(crypto);
		}
	}
	private void Sort() {
		int i;
		int j;
		int argMin;
		int totalSize = 0; // errors showed up
		SecureItem blub;
		for (i = 0; i < totalSize; i++) { // errors showed up
			argMin = i;
			for (j = i + 1; j < totalSize + 1; j++) { // errors showed up
				if (items.get(j).compareTo(items.get(argMin)) < 0) {
					argMin = j;
				}
			}
		blub = items.get(argMin);
		items.set(argMin, items.get(i));
		items.set(i, blub);
		}
	}
}
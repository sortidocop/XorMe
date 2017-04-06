/**
 * RWF_AGL-1112.<br>
 */
public final class XorUtils {

	/** The :) for 'encrypting' and 'decrypting'. */
	private static final char MJORDAN = 23;

	/**
	 * XorUtils default constructor.<br>
	 */
	private XorUtils() {

	}

	/**
	 * encryption.<br>
	 * 
	 * @param tocrypt
	 *            String
	 * 
	 * @return encrypted value
	 */
	public static String encryption(String tocrypt) {
		String result = "";
		char c;
		for (int i = 0; i < tocrypt.length(); i++) {

			c = (char) (tocrypt.charAt(i) ^ MJORDAN);

			result += (char) c;
		}
		return result;
	}

	/**
	 * decryption.<br>
	 * 
	 * @param touncrypt
	 *            String
	 * 
	 * @return decrypted value
	 */
	public static String decryption(String touncrypt) {
		return encryption(touncrypt);
	}

}

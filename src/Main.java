import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String message = "Hello, cici, I am xuzhuo";
			String certPath = "aps_developer_identity.p12";
			String certPassword = "123456";
			String authKey = "393dca32 2188a6e0 42f83a4b 8bda79e5 3a1280ef 59925632 fc802dde a6844c5b";
			boolean isProduction = false;
			Push.alert(message, certPath, certPassword, isProduction, authKey);
		} catch (CommunicationException e) {
			e.printStackTrace();
		} catch (KeystoreException e) {
			e.printStackTrace();
		}
	}


}

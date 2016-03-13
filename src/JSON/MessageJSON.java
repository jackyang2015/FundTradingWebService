package JSON;

import javax.xml.bind.annotation.XmlRootElement;

@XMLRootElement;
public class MessageJSON {
	private String message;
	public MessageJSON() {
		
	}
	public MessageJSON(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

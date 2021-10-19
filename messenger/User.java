package messenger;

import java.util.ArrayList;

public class User {
	private String eMail;
	private String username;
	private ArrayList<Message> recieved = new ArrayList<Message>();
	private ArrayList<Message> sent = new ArrayList<Message>();
	
	public User(String eMail, String username) {
		this.eMail = eMail;
		this.username = username;
	}
	
	public String get_eMail() {
		return eMail;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void sendMessage(Channel c, String text) {
		Message m = new Message(this, text);
		c.addMessage(m);
		this.sent.add(m);
	}
	
	
	public boolean signUp(Channel c) {
		return c.signUp(this);
	}
	
	
	void recieveMessage(Message m) {
		this.recieved.add(m);
	}

	
	
	
}

package messenger;

import java.util.ArrayList;

public class Channel {
	private String name;
	private boolean isPrivate = false;
	private ArrayList<Message> messages;
	private ArrayList<User> users;
	
	public Channel(String name, boolean isPrivate) {
		this.messages = new ArrayList<Message>();
		this.name = name;
		this.messages = new ArrayList<Message>();
		this.users = new ArrayList<User>();
		this.isPrivate = isPrivate;
	}
	
	public Channel(String name) {
		this(name, false);
	}
	
	public void printContents() {
		for (Message m : this.messages) {
			System.out.println(m);
		}
	}
	
	boolean signUp(User u) {
		if (this.users.contains(u) || (this.isPrivate && this.users.size() == 2)) {
			return false;
		}
		users.add(u);
		return true;
	}
	
	void addMessage(Message m) {
		if (users.contains(m.getAuthor())) {
			this.messages.add(m);
			
			for (User u : this.users) {
				if (!u.equals(m.getAuthor())) {
					u.recieveMessage(m);
				}
			}
			
		} else {
			throw new IllegalArgumentException("Attempted to add message from a foreign user: " + m.getAuthor().getUsername() + " to this channel.");
		}
	}

	public String getName() {
		return name;
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}

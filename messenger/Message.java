package messenger;

import java.time.LocalDateTime;

class Message {
	private String text;
	private User author;
	private LocalDateTime time;
	
	public Message(User author, String text) {
		this.author = author;
		this.text = text;
		this.time = LocalDateTime.now();
	}

	public User getAuthor() {
		return author;
	}

	public String getText() {
		return text;
	}

	public LocalDateTime getTime() {
		return time;
	}
	
	
	public String toString() {
		return "------------------------------------\n" +
				String.valueOf(time.getDayOfMonth()) + "_" 
				+ String.valueOf(time.getMonthValue()) + "_" + String.valueOf(time.getYear()) + " - " + this.author.getUsername() + ":\n"
				+ this.text + "\n";
	}
}

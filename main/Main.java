package main;

import messenger.Channel;
import messenger.User;

public class Main {

	public static void main(String[] args) {
		Channel channel = new Channel("Channel Test", true);
		User u1 = new User("nobody@example.com", "tpinme");
		User u2 = new User("hm@handm.com", "pipe021");
		User u3 = new User("nothing@somemail.com", "mario333");
		
		u1.signUp(channel);
		u2.signUp(channel);
		u3.signUp(channel); 
		u1.sendMessage(channel, "Some text");
		u2.sendMessage(channel, "Some more text");
		//u3.sendMessage(channel, "Hey guys!");
		channel.printContents();
		

	}

}

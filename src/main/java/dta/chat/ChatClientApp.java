package dta.chat;

import dta.chat.view.console.ChatConsoleConversationView;
import dta.chat.view.console.ChatConsoleLoginView;
import dta.chat.view.console.ChatConsoleTitleView;
import dta.chat.view.console.ChatConsoleView;

public class ChatClientApp {
	
	public static void main(String ... args) {
		ChatConsoleTitleView title = new ChatConsoleTitleView();
		ChatConsoleLoginView login = new ChatConsoleLoginView();
		ChatConsoleConversationView conv = new ChatConsoleConversationView();
		ChatConsoleView view = new ChatConsoleView(title,login,conv);
		view.print();		
	}
	
}

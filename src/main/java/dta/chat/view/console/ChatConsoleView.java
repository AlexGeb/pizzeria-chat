package dta.chat.view.console;

import java.util.ArrayList;
import java.util.List;

public class ChatConsoleView implements IConsoleView {
	List<IConsoleView> childViews = new ArrayList<IConsoleView>();
	
	public ChatConsoleView( ChatConsoleTitleView title,ChatConsoleLoginView login,ChatConsoleConversationView conv) {
		childViews.add(title);
		childViews.add(login);
		childViews.add(conv);
	}
	public void print() {
		childViews.stream().forEach(v->v.print());
	}
	
}

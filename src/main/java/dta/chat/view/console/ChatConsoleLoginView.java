package dta.chat.view.console;

import java.util.Scanner;

public class ChatConsoleLoginView implements IConsoleView {

	@Override
	public void print() {
		System.out.println(" == Login == ");
	}

	public String askLogin() {
		System.out.println("Veuillez saisir votre login :");
		Scanner scan = new Scanner(System.in);
		String login = scan.nextLine();
		scan.close();
		return login;
	}

	public void sayWelcome(String login) {
		System.out.println("Hello " + login);
	}

	public void sayAccessDenied(String login) {
		System.out.println("Acces interdit " + login);
	}

}

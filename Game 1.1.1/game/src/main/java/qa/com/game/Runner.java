package qa.com.game;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Runner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		System.out.println("Enter Name?");
		String intro = sc.nextLine();
		System.out.println(game.intro(intro));
		game.start();
		game.tresure();
		game.alergyInfo();
		String input = sc.nextLine();
		System.out.println("You Have Chosen " + game.alergySet(input));
		game.foundTresure();
	}
}

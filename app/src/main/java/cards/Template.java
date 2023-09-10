package cards;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Template {

	private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));;

	public static void print(Object object) {
		System.out.print(object);
	}

	public static void println(Object object) {
		System.out.println(object);
	}


	public static String input() throws IOException {
		return input.readLine();
	}

	public static String input(Object object) throws IOException {
		println(object);
		return input();
	}

}

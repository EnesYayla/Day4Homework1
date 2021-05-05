package Interfaces;

public class Utils {

	public static void util(Logger[] loggers,String message) {

		for (Logger loggerl : loggers) {

			loggerl.log(message);

		}
	}
}

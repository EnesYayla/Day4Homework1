package Interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Maile logland� , " + message);

	}

}

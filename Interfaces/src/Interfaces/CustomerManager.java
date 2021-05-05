package Interfaces;

public class CustomerManager {

	// private Logger logger;
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) { // beraberinde kolayl�k ile geliyor

		this.loggers = loggers; // kullan�ma a��k oluyor,yazd���m�z aaray okunacak hale geliyor
		// ayr� ayr� methodlar�n imzalar�na yazmak yerine
		// bir kez constructor ie �a��rmak yetiyor
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		Utils.util(loggers, customer.getFirstName()); // s�reklikullanaca��n methodlar� static ile nwlemeye gerek
														// kalmadan kullanabilirsin

	}

	public void delete(Customer customer) {
		System.out.println("M��teri Silindi : " + customer.getFirstName());
		Utils.util(loggers, customer.getFirstName());
	}

}

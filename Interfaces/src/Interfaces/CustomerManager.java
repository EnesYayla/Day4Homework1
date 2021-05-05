package Interfaces;

public class CustomerManager {

	// private Logger logger;
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) { // beraberinde kolaylýk ile geliyor

		this.loggers = loggers; // kullanýma açýk oluyor,yazdýðýmýz aaray okunacak hale geliyor
		// ayrý ayrý methodlarýn imzalarýna yazmak yerine
		// bir kez constructor ie çaðýrmak yetiyor
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFirstName());
		Utils.util(loggers, customer.getFirstName()); // süreklikullanacaðýn methodlarý static ile nwlemeye gerek
														// kalmadan kullanabilirsin

	}

	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi : " + customer.getFirstName());
		Utils.util(loggers, customer.getFirstName());
	}

}

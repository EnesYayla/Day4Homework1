package Interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = new Logger[] { new DatabaseLogger(), new EmailLogger(), new FileLogger() };

		Customer customer = new Customer("Ýsmail", "Türküsev", -137);
        Customer customer2 = new Customer("Can","Bonomo",-438);
        
		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add(customer);
		System.out.println("-----------------------");
		System.out.println(" ");
		customerManager.delete(customer2);

	}

}

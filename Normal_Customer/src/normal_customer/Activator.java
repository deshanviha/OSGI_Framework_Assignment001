package normal_customer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import softdrink_publisher.softDrinkPublisher;
import Hot_Drink_Publisher.hotDrinkPublisher;
import juice_publisher.juicePublisher;

public class Activator implements BundleActivator {


	ServiceReference serviceReferanceSoftDrink;
	ServiceReference serviceReferanceJuice;
	ServiceReference serviceReferanceHotDrink;

	Scanner cat = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);
	public void start(BundleContext bundleContext) throws Exception {

	
		

		serviceReferanceSoftDrink = bundleContext.getServiceReference(softDrinkPublisher.class.getName());
		softDrinkPublisher SoftDrinkPublisher = (softDrinkPublisher) bundleContext.getService(serviceReferanceSoftDrink);
		
		serviceReferanceJuice = bundleContext.getServiceReference(juicePublisher.class.getName());
		juicePublisher juicePublisher = (juicePublisher) bundleContext.getService(serviceReferanceJuice);

		serviceReferanceHotDrink = bundleContext.getServiceReference(hotDrinkPublisher.class.getName());
		hotDrinkPublisher HotDrinkPublisher = (hotDrinkPublisher) bundleContext.getService(serviceReferanceHotDrink);
		
		System.out.println("Normal Customer has started.");

		System.out.println("Beverages : ");
		System.out.println("1. Soft Drink");
		System.out.println("2. Fruit juice");
		System.out.println("3. Hot Drinks\n");

		double total = 0;
		int category, type, sel;
		ArrayList<String> PurchasedItems = new ArrayList<String>();

		
			System.out.print("Select a Soft Drink: ");
			category = cat.nextInt();

			if (category == 1) {
				System.out.println("\nSelect a Drink Type: ");
				System.out.println("1. Coca Cola");
				System.out.println("2. Sprite");
				System.out.println("3. Pepsi");
				System.out.println("4. Cream Soda");

				System.out.println("\nPress O to Exit\n");
				System.out.print("Select a Soft Drink: ");
				type = cat.nextInt();

				while (type != 0) {

					SoftDrinkPublisher.displaySoftDrink(type);
					System.out.println("\nType -1 to exit from the Current Type.");
					System.out.print("\nSelect a Type : ");
					sel = cat.nextInt();
					while (sel != -1) {
						total += SoftDrinkPublisher.getPrice(type, sel);
						PurchasedItems.add(SoftDrinkPublisher.getName(type, sel));
						System.out.print("Select a Type : ");
						sel = cat.nextInt();

					}
					System.out.print("\nSelect a Soft Drink: ");
					type = cat.nextInt();
				}

			} else if (category == 2) {
				System.out.println("\nSelect a Juice: ");
				System.out.println("1.  Lime Juice");
				System.out.println("2.  Lemon Juice");
				System.out.println("3.  Apple Juice");
				System.out.println("4.  Watermelon Juice");
				System.out.println("5.  Avacado Juice");
				System.out.println("6.  Grapes Juice");

				System.out.println("\nPress O to Exit");
				System.out.print("\nSelect a Juice: ");
				type = cat.nextInt();
				while (type != 0) {

					juicePublisher.getJuice(type);
					System.out.println("\nType -1 to exit from the Current Type.");
					System.out.print("\nSelect a Type: ");
					sel = cat.nextInt();
					while (sel != -1) {
						total += juicePublisher.getPrice(type, sel);
						PurchasedItems.add(juicePublisher.getName(type, sel));
						System.out.print("Select a Type: ");
						sel = cat.nextInt();
					}
					System.out.print("\nSelect a Juice: ");
					type = cat.nextInt();
				}
			}
			
			else if (category == 3) {
				System.out.println("\nSelect Hot Drink : ");
				System.out.println("1.  Tea");
				System.out.println("2.  Coffee");		

				System.out.println("\nPress O to Exit");
				System.out.print("\nSelect a Hot Drink : ");
				type = cat.nextInt();
				while (type != 0) {

					HotDrinkPublisher.getHotDrink(type);;
					System.out.println("\nType -1 to exit from the Current Type.");
					System.out.print("\nSelect a Type: ");
					sel = cat.nextInt();
					while (sel != -1) {
						total += HotDrinkPublisher.getHotDrinkPrice(type, sel);
						PurchasedItems.add(HotDrinkPublisher.getHotDrinkName(type, sel));
						System.out.print("Select a Type: ");
						sel = cat.nextInt();
					}
					System.out.print("Select a Hot Drink :");
					type = cat.nextInt();
				}
			}
			
			System.out.println("Purchased Items: " + PurchasedItems);
			System.out.println("Total price:Rs." + total);

			System.out.println("\n Select Payment Method");
			System.out.println("1. Cash");
			System.out.println("2. Visa");
			System.out.println("3. American Express");
			System.out.println("4. Online Transfer");
			
			   String str = scan.nextLine();
	            int choice = Integer.parseInt(str);
	           
	            
	            switch (choice) {
	            
	            case 1:
		            System.out.println("Cash");
		            System.out.println("Placed Order and started to prepare");
		            System.out.println("Pending Payment");
		            this.start(bundleContext);
	            case 2:
	    
		            System.out.println("Debit Card");
		            System.out.println("Please enter your card number[8-digits]");
		            int number = scan.nextInt();
		            System.out.println("Payment Success.....");
		            this.start(bundleContext);
	           
	            case 3: 
	        	   System.out.println("Paypal");
		            System.out.println("Please enter paypal address");
		            String paypal = scan.nextLine();
		            System.out.println("Payment Success.....");
		            this.start(bundleContext);
	           		            
	            case 4: 
		        	   System.out.println("Online Transfer");
			            System.out.println("Please enter the payment slip reference number");
			            String ref_Number = scan.nextLine();
			            System.out.println("Payment Success.....");
			            this.start(bundleContext);     
	            default:
	               break;
	        }
	}     	   
	
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Normal Coustomer Has Stopped.");
		bundleContext.ungetService(serviceReferanceSoftDrink);
		bundleContext.ungetService(serviceReferanceJuice);
		bundleContext.ungetService(serviceReferanceHotDrink);
	}

}
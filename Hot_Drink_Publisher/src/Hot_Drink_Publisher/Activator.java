package Hot_Drink_Publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherServiceRegistration;



	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Hot Drink publisher has Started.");		
	
		hotDrinkPublisher teaPublisher = new hotDrinkPublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(hotDrinkPublisher.class.getName(), teaPublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Hot Drink publisher has Stopped");
		publisherServiceRegistration.unregister();
	}

}

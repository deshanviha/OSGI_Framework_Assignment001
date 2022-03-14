package softdrink_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	
	ServiceRegistration publisherServiceRegistration;


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Soft Drink Publisher has Started.");		
		softDrinkPublisher softdrinkPublisher = new softDrinkPublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(softDrinkPublisher.class.getName(), softdrinkPublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		

		System.out.println("Soft Drink Publisher has Stopped");
		publisherServiceRegistration.unregister();
	
	}

}

package juice_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherServiceRegistration;
	


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Juice Publisher has Started.");		
		juicePublisher juicePublisher = new juicePublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(juicePublisher.class.getName(), juicePublisher, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Juice Publisher has Stopped");
		publisherServiceRegistration.unregister();
	}

}

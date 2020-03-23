package org.serc.helloworld.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.serc.helloworld.Hello;

public class HelloUser implements BundleActivator {

	public void start(BundleContext ctx) {
		ServiceReference ref = ctx.getServiceReference(Hello.class.getName());
		if (ref != null) {
			Hello hello = null;
			try {
				hello = (Hello) ctx.getService(ref);
				if (hello != null)
					hello.sayHello();
				else
					System.out.println("Service:Hello---objectnull");
			} catch (RuntimeException e) {
				e.printStackTrace();
			} finally {
				ctx.ungetService(ref);
				hello = null;
			}
		} else {
			System.out.println("Service:Hello---notexists");
		}
	}

	public void stop(BundleContext ctx) throws Exception {
	}

}

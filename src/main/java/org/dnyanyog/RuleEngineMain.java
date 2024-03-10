package org.dnyanyog;

import org.dnyanyog.config.DroolsBeanFactory;
import org.dnyanyog.dto.Customer;
import org.kie.api.runtime.KieSession;

public class RuleEngineMain {

	public static void main(String[] args) {

		// kie => Knowledge is everything 
		
		int customerAge = 31;
		String customerGender = "F";
		String festiveSeason = "yes";
		
		KieSession kSession = new DroolsBeanFactory().getKieSession(); // Get build kie container (package)

		if (kSession != null) {
			// Use kSession to insert objects and fire rules
			Customer customer = new Customer();
			customer.setAge(customerAge);
			customer.setGender(customerGender);
			customer.setFestiveSeason(festiveSeason);
			
			kSession.insert(customer);// Insert customer object which should match in drools file

			// Fire the rules
			kSession.fireAllRules();

			// Close the session
			kSession.dispose();

			System.out.println("Customer Discount: " + customer.getDiscount());
			

		} else {
			System.err.println("Failed to create KieSession");
		}
	}
}

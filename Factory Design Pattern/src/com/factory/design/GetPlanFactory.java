package com.factory.design;

import com.factory.constants.Constants;
import com.factory.model.CommunityEdition;
import com.factory.model.EnterpriseEdition;
import com.factory.model.Plan;
import com.factory.model.PremiumEdition;;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class GetPlanFactory {
	
	public Plan getPlan(String type) {
		
		Plan plan = null;
		
		if(Constants.ENTERPRISE.equalsIgnoreCase(type)) {
			plan = new EnterpriseEdition();
		}
		else if(Constants.PREMIUM.equalsIgnoreCase(type)) {
			plan = new PremiumEdition();
		}
		else if(Constants.COMMUNITY.equalsIgnoreCase(type)) {
			plan = new CommunityEdition();
		}
		
		return plan;
	}
}

package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" campaign added");
		
	}

	@Override
	public void uptdate(Campaign campaign) {
		System.out.println(campaign.getName()+"campaign updated");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+"campaign deleted");
		
	}
	
	
}

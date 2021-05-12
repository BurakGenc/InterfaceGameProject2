package Concrete;

import Abstract.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SellManager implements SellService{

	
	
	//if player do not join campaign
	@Override
	public void sellGame(Player player, Game game) {
		
		
		System.out.println(player.getFirstName()+" adlı oyuncu "+ game.getName()+ " oyununu satın aldı");
		
	}

	//if player join campaign
	@Override
	public void sellGame(Player player, Game game, Campaign campaign) {
		double UnitPriceAfterDiscount=game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100);
		
		
		
		
		System.out.println(player.getFirstName()+ " Adlı oyuncu "+game.getPrice()+" TL olan Oyunu %" +campaign.getDiscountRate()+" indirim ile "+game.getName()+" oyununu "+UnitPriceAfterDiscount+" fiyat ile satin aldi");
	}

}

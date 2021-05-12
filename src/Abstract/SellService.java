package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SellService {
	
	//if player do not join campaign
	public void sellGame(Player player,Game game);
	
	
	// if player join campaign
	public void sellGame(Player player,Game game,Campaign campaign);
	
}

import Concrete.CampaignManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1= new Player(1,"burak","genc",1999,01,22,"23104176916");
		Game game1 = new Game(1,"pes 2020",200);
		Campaign campaign1= new Campaign(1,"kampanya1",20);
		
		
		
		
		
		PlayerManager playermanager = new PlayerManager(new PlayerCheckManager());
		playermanager.add(player1);
		
		CampaignManager campaignManager =new CampaignManager();
		campaignManager.add(campaign1);
		
		
		
		SellManager sellManager = new SellManager();
		sellManager.sellGame(player1, game1, campaign1);
		
	}

}

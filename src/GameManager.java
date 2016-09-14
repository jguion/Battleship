import java.io.IOException;

public class GameManager {
	
	
	public static void main(String [] args){
		
		//create instance of game (and server)
		GameManager g = new GameManager();
		//wait for two players to connect
		//g.waitForPlayersToConnect();
		// init players
		//g.initPlayers();
		
		Client c = new Client("Jeff");
		try {
			c.initPlayer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void waitForPlayersToConnect(){
		
	}
	
	public void initPlayers(){
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class GameManager {
	ServerSocket listener;
	ArrayList<Client> clients;
	
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
	
	public void waitForPlayersToConnect() throws IOException{
		this.listener = new ServerSocket(10000);
		while(this.clients.size() < 2){
			Socket clientSocket = this.listener.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			//BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()), true);
		}
		
	}
	
	public void initPlayers(){
		//assync by arraylist.getparallelstream
		this.clients.parallelStream().forEach(client -> {
			try {
				client.initPlayer();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	public void playGame() throws IOException{
	}
}

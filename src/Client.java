import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Client {
	public String name;
	PrintWriter out = null;
	BufferedReader in = null;
	GameBoard board = new GameBoard(10, 10);
	
	//
	public void initPlayer() throws IOException{
		out.println("Enter Player name");
		out.flush();
		this.name = in.readLine();
		
		//for player input, loop through input
		//split line on " " to get arguments (merge last arguments for ship name
		//then create ship and add new ship to gameboard
		//then print board out to client (and flush)
		
		
	}
	

}

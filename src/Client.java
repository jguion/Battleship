import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Client {
	public String name;
	//PrintWriter out = null;
	BufferedReader in = null;
	PrintStream out; 
	GameBoard board = new GameBoard(10, 10);
	ArrayList<Ship> ships;
	
	public Client(String name){
		this.name=name;
		this.out = System.out;
		this.in = new BufferedReader(new InputStreamReader(System.in));
		this.ships = new ArrayList<Ship>();
	}
	
	public Client(String name, BufferedReader in, PrintStream out){//,GameManager gm){
		this.name=name;
		this.out = out;
		this.in = in;
		this.ships = new ArrayList<Ship>();
	}
	
	//
	public void initPlayer() throws IOException{
		out.println("Enter Player name");
		out.flush();
		this.name = in.readLine();
		
		//for player input, loop through input
		//split line on " " to get arguments (merge last arguments for ship name
		//then create ship and add new ship to gameboard
		//then print board out to client (and flush)
		while(ships.size() < 2){
			out.println("Add a Ship! \n"+
					    "types are Cruiser (C) and Destroyer (D) \n"+
						"Also choose starting coordinates, direction and name (no spaces for now) \n"+
					    "Example Ship: D 1 5 N King_of_da_North");
			
			String shipText = in.readLine();
			String[] shipArray = shipText.split(" ");
			String type = shipArray[0];
			String x = shipArray[1];
			String y = shipArray[2];
			String dir = shipArray[3];
			String shipName = shipArray[4];
			
			Position p = new Position(x,y);
			HEADING direction = HEADING.getHeading(dir);
			Ship s = null;
			
			if(type.equalsIgnoreCase("d")){
				s = new Destroyer(shipName, p, direction);
			}else if(type.equalsIgnoreCase("c")){
				s = new Cruiser(shipName, p, direction);
			}
			
			if(board.addShip(s)){
				this.ships.add(s);
			}else{
				continue;
			}
			String b = board.draw();
			out.print(b);
			
		}
		
	}
	

}

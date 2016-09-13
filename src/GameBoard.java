import java.util.ArrayList;
public class GameBoard {
	int rows = 10;
	int columns = 10;
	
	ArrayList<ArrayList<Cell>> cells;
	
	public GameBoard(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
	}
	
	public String draw(){
		return " ";
	}
}

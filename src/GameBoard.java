import java.util.ArrayList;
public class GameBoard {
	int rows = 10;
	int columns = 10;
	
	ArrayList<ArrayList<Cell>> cells;
	
	public GameBoard(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		
		this.cells = new ArrayList<ArrayList<Cell>>();
		
		for(int i = 0; i < rows; i++){
			ArrayList<Cell> row = new ArrayList<Cell>();
			for(int j = 0; j < columns; j++){
				Cell c = new Cell(i, j);
				row.add(c);
			}
			this.cells.add(row);
		}
	}
	
	public String draw(){
		String board = "";
		for(ArrayList<Cell> row : cells){
			for(Cell cell : row){
				board+=cell.draw();
			}
			board+="\n";
		}
		return board;
	}
	
	public Cell getCell(Position p){
		return this.cells.get(p.getX()).get(p.getY());
	}
	
	public boolean addShip(Ship s){
		if(safetyCheck(s)){
			Position p = s.getPosition();
			int i = 0;
			if(s.getDirection() == HEADING.NORTH){
				i = p.getY() - s.getSize();
			}else if(s.getDirection() == HEADING.SOUTH){
				i = p.getY();
			}else if(s.getDirection() == HEADING.EAST){
				i = p.getX();
			}else if(s.getDirection() == HEADING.WEST){
				i = p.getX() - s.getSize();
			}
			int limit = i + s.getSize();
			for(; i < limit; i++){
				if(s.getDirection() == HEADING.EAST || s.getDirection() == HEADING.WEST){
					cells.get(p.getY()).get(i).addShip(s);
				}else{
					cells.get(i).get(p.getX()).addShip(s);
				}
			}
			return true;
		}else{
			return false;
		}
	}
	
	private boolean safetyCheck(Ship s){
		return true;
	}
	
	public Ship fireMissile( Position coordinate ){
		Cell c = this.cells.get(coordinate.getX()).get(coordinate.getY());
		c.hasBeenStruckByMissile(true);
		
		return c.s;
	}
}

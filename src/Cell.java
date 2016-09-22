
public class Cell {
	int x;
	int y;
	Ship s = null;
	boolean hit = false;
	protected boolean struckByMissle = false;
	
	Cell(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void addShip(Ship s){
		this.s = s;
	}
	
	public boolean isHit(){
		return this.hit;
	}
	
	public Ship getShip(){
		return this.s;
	}
	
	public char draw(){
		if(this.s == null){
			if(this.hit){
				return 'X';
			}else{
				return '_';
			}
		}else{
			return this.s.drawShipStatusAtCell(this.hasBeenStruckByMissile());
		}
	}
	
	public boolean hasBeenStruckByMissile(){
		return struckByMissle;
	}
	
	public void hasBeenStruckByMissile( boolean wasStruck ){
		this.struckByMissle = wasStruck;
	}
	
}


public class Cell {
	int x;
	int y;
	Ship s = null;
	boolean hit = false;
	
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
	
	public String draw(){
		if(this.s == null){
			if(this.hit){
				return "X";
			}else{
				return " ";
			}
		}else{
			return this.s.draw();
		}
	}
	
}

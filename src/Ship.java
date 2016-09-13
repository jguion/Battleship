
public abstract class Ship {
	Position p;
	HEADING direction;
	String name;
	
	public Ship(String name){
		this.name = name;
	}
	
	abstract public String draw();
}

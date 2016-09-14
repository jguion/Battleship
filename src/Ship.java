
public abstract class Ship {
	Position p;
	HEADING direction;
	String name;
	
	public Ship(String name, Position p, HEADING h){
		this.name = name;
		this.p = p;
		this.direction = h;
	}
	
	abstract public String draw();

	public Position getPosition() {
		return p;
	}

	public void setPosition(Position p) {
		this.p = p;
	}

	public HEADING getDirection() {
		return direction;
	}

	public void setDirection(HEADING direction) {
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract public int getSize();
}

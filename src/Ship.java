import java.util.ArrayList;

public abstract class Ship {
	Position p;
	HEADING direction;
	String name;
	protected ArrayList< Cell > position = null;
	
	public Ship(String name, Position p, HEADING h){
		this.name = name;
		this.p = p;
		this.direction = h;
	}
	
	abstract public String draw();
	
	public abstract char drawShipStatusAtCell( boolean isDamaged );

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
	
	public boolean isAlive(){
		for( Cell c : this.position )
			if( ! c.hasBeenStruckByMissile() )
				return true;
		return false;
	}
}

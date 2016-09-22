
public class Destroyer extends Ship {
	
	int size = 4;

	public Destroyer(String name, Position p, HEADING h) {
		super(name, p, h);
	}

	@Override
	public String draw() {
		return "|D|";
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public char drawShipStatusAtCell(boolean isDamaged) {
		if(isDamaged){
			return 'd';
		}else{
			return 'D';
		}
	}

}

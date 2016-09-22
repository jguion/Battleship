
public class Cruiser extends Ship {

	int size = 3;
	
	
	public Cruiser(String name, Position p, HEADING h) {
		super(name, p, h);
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "|C|";
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public char drawShipStatusAtCell(boolean isDamaged) {
		// TODO Auto-generated method stub
		if(isDamaged){
			return 'c';
		}else{
			return 'C';
		}
	}
	
}


public enum HEADING {
	NORTH, SOUTH, EAST, WEST;
	
	
	public static HEADING getHeading(String d){
		if(d.equalsIgnoreCase("n")){
			return NORTH;
		}else if(d.equalsIgnoreCase("s")){
			return SOUTH;
		}else if(d.equalsIgnoreCase("e")){
			return EAST;
		}else{
			return WEST;
		}
	}
}

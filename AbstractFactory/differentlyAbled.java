

public class differentlyAbled extends Factory {

  
    public differentlyAbled() {
    }

    @Override
	public outdoorAdventure categoryA(String ptype) {
		if(ptype.equalsIgnoreCase("para"))
			return (outdoorAdventure) new paraD();
	else if(ptype.equalsIgnoreCase("trek"))
			return (outdoorAdventure) new trekD();
		return null;
	}
    public outdoorRegular categoryR(String ptype) {
		if(ptype.equalsIgnoreCase("cic"))
			return (outdoorRegular) new cicD();
	else if(ptype.equalsIgnoreCase("foo"))
			return (outdoorRegular) new fooD();
		return null;
	}
    @Override
	public IndoorRegular categoryI(String ptype) {
		if(ptype.equalsIgnoreCase("tt"))
			return  (IndoorRegular) new ttD();
	else if(ptype.equalsIgnoreCase("sq"))
			return (IndoorRegular) new sqD();
		return null;
	}
}
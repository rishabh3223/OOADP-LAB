
public class abled extends Factory {

    public abled() {
    }

	@Override
	public outdoorAdventure categoryA(String ptype) {
		if(ptype.equalsIgnoreCase("para"))
			return (outdoorAdventure) new paraA();
	else if(ptype.equalsIgnoreCase("trek"))
			return (outdoorAdventure) new trekA();
		return null;
	}
	@Override
	public outdoorRegular categoryR(String ptype) {
		if(ptype.equalsIgnoreCase("cic"))
			return  (outdoorRegular) new cicA();
	else if(ptype.equalsIgnoreCase("foo"))
			return (outdoorRegular) new fooA();
		return null;
	}
	@Override
	public IndoorRegular categoryI(String ptype) {
		if(ptype.equalsIgnoreCase("tt"))
			return  (IndoorRegular) new ttA();
	else if(ptype.equalsIgnoreCase("sq"))
			return (IndoorRegular) new sqA();
		return null;
	}
}
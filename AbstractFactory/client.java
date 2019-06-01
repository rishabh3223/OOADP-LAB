public class client {
	
    public static void main( String args[]) {
        
    	outdoorAdventure A;
    	outdoorRegular R;
    	IndoorRegular I;
    	Factory f=new abled();
    	A=f.categoryA("para");
    	A.display();
    	R=f.categoryR("cic");
    	R.display();
    	I=f.categoryI("tt");
    	I.display();
    	System.out.println();
    	Factory p=new differentlyAbled();
    	A=p.categoryA("trek");
    	A.display();
    	R=p.categoryR("foo");
    	R.display();
    	I=p.categoryI("sq");
    	I.display();
    }

}
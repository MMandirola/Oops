
public class OopsIntegerClass extends OopsClass{
	private static final OopsClass instance = new OopsIntegerClass("OopsIntegerClass");
	
	private OopsIntegerClass(String name){
		super(name);
	}
}
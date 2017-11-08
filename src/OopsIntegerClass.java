
public class OopsIntegerClass extends OopsClass{
	private static final OopsClass instance = new OopsIntegerClass("OopsBooleanClass");
	
	private OopsIntegerClass(String name){
		super(name);
	}
}

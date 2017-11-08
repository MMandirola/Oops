
public class OopsBlockClass extends OopsClass{
	private static final OopsClass instance = new OopsBlockClass("OopsBooleanClass");
	
	private OopsBlockClass(String name){
		super(name);
	}
}

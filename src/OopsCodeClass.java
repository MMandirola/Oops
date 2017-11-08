
public class OopsCodeClass extends OopsClass {
	private static final OopsClass instance = new OopsCodeClass("OopsCodeClass");
	
	private OopsCodeClass(String name){
		super(name);
	}
}

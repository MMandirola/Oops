package classes;


public class OopsBooleanClass extends OopsClass{
	private static final OopsClass instance = new OopsBooleanClass("OopsBooleanClass");
	
	private OopsBooleanClass(String name){
		super(name);
	}
	
	public static OopsClass getInstance(){
		return instance;
	}
}

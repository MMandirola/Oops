package classes;

import methods.OopsAnd;
import methods.OopsNot;
import methods.OopsOr;


public class OopsBooleanClass extends OopsClass{
	private static final OopsClass instance = new OopsBooleanClass("OopsBooleanClass");
	
	private OopsBooleanClass(String name){
		super(name);
		this.methodReference.put("!", new OopsNot());
		this.methodReference.put("&&", new OopsAnd());
		this.methodReference.put("||", new OopsOr());
	}
	
	public static OopsClass getInstance(){
		return instance;
	}
}

package classes;

import methods.OopsDistinct;
import methods.OopsEquals;
import methods.OopsLTE;
import methods.OopsSub;
import methods.OopsSum;
import methods.OopsTimes;


public class OopsIntegerClass extends OopsClass{
	private static final OopsClass instance = new OopsIntegerClass("OopsIntegerClass");
	
	private OopsIntegerClass(String name){
		super(name);
		this.methodReference.put("+", new OopsSum());
		this.methodReference.put("-", new OopsSub());
		this.methodReference.put("*", new OopsTimes());
		this.methodReference.put("<=", new OopsLTE());
		this.methodReference.put("==", new OopsEquals());
		this.methodReference.put("!=", new OopsDistinct());
	}
	
	public static OopsClass getInstance(){
		return instance;
	}
}

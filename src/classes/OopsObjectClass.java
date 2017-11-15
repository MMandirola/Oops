package classes;

import methods.OopsDistinct;
import methods.OopsEquals;
import methods.OopsLTE;
import methods.OopsSub;
import methods.OopsSum;
import methods.OopsTimes;

public class OopsObjectClass extends OopsClass{
	private static final OopsClass instance = new OopsObjectClass("OopsObjectClass");
	
	private OopsObjectClass(String name){
		super(name);
	}
	
	public static OopsClass getInstance(){
		return instance;
	}

}

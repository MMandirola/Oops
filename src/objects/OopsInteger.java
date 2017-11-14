package objects;

import methods.OopsDistinct;
import methods.OopsEquals;
import methods.OopsLTE;
import methods.OopsSub;
import methods.OopsSum;
import methods.OopsTimes;
import classes.OopsClass;
import classes.OopsIntegerClass;

public class OopsInteger extends OopsObject{
	private Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public OopsInteger(Integer value){
		this.clase = OopsIntegerClass.getInstance();
		this.value = value;
	}
}

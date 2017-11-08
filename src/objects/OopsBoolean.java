package objects;

import methods.OopsAnd;
import methods.OopsNot;
import methods.OopsOr;
import classes.OopsBooleanClass;
import classes.OopsClass;

public class OopsBoolean extends OopsObject{
	private OopsClass clase = OopsBooleanClass.getInstance();
	private boolean value;
	
	public boolean isValue() {
		return value;
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
	public OopsBoolean(boolean value) {
		this.value = value;
	}
}

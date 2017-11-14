package objects;

import classes.OopsBooleanClass;

public class OopsBoolean extends OopsObject{
	private boolean value;
	
	public boolean isValue() {
		return value;
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
	public OopsBoolean(boolean value) {
		this.clase = OopsBooleanClass.getInstance();
		this.value = value;
	}
}

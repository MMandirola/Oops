package objects;

import utils.OopsState;


public class OopsValue extends OopsCode{
	private OopsObject value;
	@Override
	public OopsObject evaluate(OopsState state) {
		return value;
	}
	public OopsValue(OopsObject value) {
		this.value = value;
	}
	public OopsObject getValue() {
		return value;
	}
	public void setValue(OopsObject value) {
		this.value = value;
	}	

}

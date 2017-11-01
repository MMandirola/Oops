
public class OopsBoolean extends OopsObject{

	private boolean value;
	public boolean isValue() {
		return value;
	}
	public OopsBoolean(boolean value) {
		this.value = value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	public OopsObject respond(String name, OopsObject[] args) {
		switch(name){
			case "!":
				return new OopsBoolean(!this.value);
			case "&&":
				OopsBoolean b = (OopsBoolean) args[0];
				boolean value = b.isValue() && this.value;
				return new OopsBoolean(value);
			case "||":
				OopsBoolean b1 = (OopsBoolean) args[0];
				boolean value1 = b1.isValue() || this.value;
				return new OopsBoolean(value1);
			default:
				return this;
				
		}
	}

}

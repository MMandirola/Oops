
public class OopsInteger extends OopsObject{

	Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public OopsInteger(Integer value){
		this.value = value;
	}

	public OopsObject respond(String name, OopsObject[] args) {
		OopsObject result = null;
		OopsInteger firstArg = (OopsInteger) args[0];
		
		switch(name){
			case "+":
				result = new OopsInteger(this.value + firstArg.getValue());
			case "-":
				result = new OopsInteger(this.value - firstArg.getValue());
			case "*":
				result = new OopsInteger(this.value * firstArg.getValue());
			case "<=":
				result = new OopsBoolean(this.value <= firstArg.getValue());
			case "==":
				result = new OopsBoolean(this.value == firstArg.getValue());
			case "!=":
				result = new OopsBoolean(this.value != firstArg.getValue());
		}
		
		return result;
	}
	
}

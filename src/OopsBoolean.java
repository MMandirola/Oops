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
		this.clase.methodReference.put("!", new OopsNot());
		this.clase.methodReference.put("&&", new OopsAnd());
		this.clase.methodReference.put("||", new OopsOr());
	}
}

public class OopsBoolean extends OopsObject{
	
	private boolean value;
	
	public boolean isValue() {
		return value;
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
	public OopsBoolean(boolean value, OopsClass clase) {
		super(clase);
		this.value = value;
		this.clase.methodReference.put("!", new OopsNot());
		this.clase.methodReference.put("&&", new OopsAnd());
		this.clase.methodReference.put("||", new OopsOr());
	}
}

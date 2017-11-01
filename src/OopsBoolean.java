public class OopsBoolean extends OopsObject{
	
	private boolean value;
	
	public boolean isValue() {
		return value;
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
	public OopsBoolean(boolean value) {
		this.value = value;
		
		methodReference.put("!", new OopsNot());
		methodReference.put("&&", new OopsAnd());
		methodReference.put("||", new OopsOr());
	}
}

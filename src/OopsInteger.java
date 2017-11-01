public class OopsInteger extends OopsObject{
	
	private Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public OopsInteger(Integer value){
		this.value = value;

		methodReference.put("+", new OopsSum());
		methodReference.put("-", new OopsSub());
		methodReference.put("*", new OopsTimes());
		methodReference.put("<=", new OopsLTE());
		methodReference.put("==", new OopsEquals());
		methodReference.put("!=", new OopsDistinct());
	}
}

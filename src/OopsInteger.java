public class OopsInteger extends OopsObject{
	private OopsClass clase = OopsIntegerClass.getInstance();
	private Integer value;
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public OopsInteger(Integer value){
		this.value = value;
		this.clase.methodReference.put("+", new OopsSum());
		this.clase.methodReference.put("-", new OopsSub());
		this.clase.methodReference.put("*", new OopsTimes());
		this.clase.methodReference.put("<=", new OopsLTE());
		this.clase.methodReference.put("==", new OopsEquals());
		this.clase.methodReference.put("!=", new OopsDistinct());
	}
}

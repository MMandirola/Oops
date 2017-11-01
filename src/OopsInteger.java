import java.util.HashMap;
import java.util.Map;


public class OopsInteger extends OopsObject{

	private static final Map<String, OopsMethod> methodReference;
    static
    {
    	methodReference = new HashMap<String, OopsMethod>();
    	methodReference.put("+", new OopsSum());
    	methodReference.put("-", new OopsSub());
    	methodReference.put("*", new OopsTimes());
    	methodReference.put("<=", new OopsLTE());
    	methodReference.put("==", new OopsEquals());
    	methodReference.put("!=", new OopsDistinct());
    }
	
	private Integer value;
	
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
		
		if(methodReference.containsKey(name)){
			result = methodReference.get(name).evaluate(this, args);
		}else{
			result = this;
		}
		
		return result;
	}	
	
}

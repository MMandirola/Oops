import java.util.HashMap;
import java.util.Map;

public abstract class OopsObject {
	
	protected Map<String, OopsMethod> methodReference = new HashMap<String, OopsMethod>();;
	
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

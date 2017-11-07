import java.util.HashMap;
import java.util.Map;


public class OopsClass extends OopsObject{
	public final String name;
	public Map<String, OopsMethod> methodReference = new HashMap<String, OopsMethod>();
	public OopsMethod method(String selector){
		OopsClass sup = this;
		while(sup != null){
			OopsMethod elem = sup.methodReference.getOrDefault(selector, null);
			if(elem != null){
				return elem;
			}
			else{
				sup = sup.clase;
			}
		}
		return null;
	}
	public OopsClass(String name, OopsClass superclass){
		super(superclass);
		this.name = name;
	}
}

package classes;
import java.util.HashMap;
import java.util.Map;

import objects.OopsObject;
import methods.OopsClassMethod;
import methods.OopsMethod;
import methods.OopsNew;


public class OopsClass extends OopsObject{
	private final static OopsClass instance = new OopsClass("OopsClass");
	private OopsClass clase = null;
        
	
	public final String name;
	public Map<String, OopsMethod> methodReference = new HashMap<String, OopsMethod>();
	public OopsMethod method(String selector){
		OopsClass sup = this;
		while(sup != null){
			OopsMethod elem = sup.methodReference.get(selector);
			if(elem != null){
				return elem;
			}
			else{
				sup = sup.clase;
			}
		}
		return null;
	}
	
	protected OopsClass(String name){
		this.name = name;
		this.methodReference.put("class", new OopsClassMethod());
                this.methodReference.put("new", new OopsNew());
	}
	
	public static OopsClass getInstance(){
		return instance;
	}
}

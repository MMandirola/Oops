import java.util.HashMap;
import java.util.Map;

public abstract class OopsObject {
	public OopsClass clase;
	public OopsObject respond(String name, OopsObject[] args, OopsState state) {
		OopsObject result = null;
		
		if(clase.method(name) != null){
			result = clase.method(name).evaluate(this, args,state);
		}else{
			result = this;
		}
		
		return result;
	}
	public OopsObject(OopsClass clase){
		this.clase = clase;
		if (this.clase != null){
			this.clase.methodReference.put("class", new OopsClassMethod());
		}
	}
}

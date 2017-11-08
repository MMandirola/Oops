

public abstract class OopsObject {
	public OopsClass clase = OopsClass.getInstance();
	public OopsObject respond(String name, OopsObject[] args, OopsState state) {
		OopsObject result = null;
		
		if(clase.method(name) != null){
			result = clase.method(name).evaluate(this, args,state);
		}else{
			result = this;
		}
		
		return result;
	}
}

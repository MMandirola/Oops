package objects;

import java.util.HashMap;

import utils.OopsState;
import classes.OopsClass;


public class OopsObject {
	private HashMap<String, OopsObject> properties = new HashMap<String, OopsObject>();
	

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

        
        public OopsObject(OopsClass xclase){
                this.clase = xclase;
        
        } 
        
        public OopsObject(){
        
        } 

	
	public OopsObject getProperty(String key){
		return properties.get(key);
	}
	
	public void setProperty(String key, OopsObject value){
		properties.put(key, value);
	}

}

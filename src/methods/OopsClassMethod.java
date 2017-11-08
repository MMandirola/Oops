package methods;
import objects.OopsMethod;
import objects.OopsObject;
import objects.OopsState;


public class OopsClassMethod extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		if(self.clase != null){
			return self.clase;
		}
		else{
			return null;
		}
	}

}

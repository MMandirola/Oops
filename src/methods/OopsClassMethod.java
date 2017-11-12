package methods;
import objects.OopsObject;
import utils.OopsState;


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

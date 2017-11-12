package methods;
import objects.OopsBoolean;
import objects.OopsObject;
import utils.OopsState;


public class OopsNot extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean value = (OopsBoolean) self;
		
		return new OopsBoolean(!value.isValue());
	}
	
}
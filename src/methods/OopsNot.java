package methods;
import objects.OopsBoolean;
import objects.OopsMethod;
import objects.OopsObject;
import objects.OopsState;


public class OopsNot extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean value = (OopsBoolean) self;
		
		return new OopsBoolean(!value.isValue());
	}
	
}
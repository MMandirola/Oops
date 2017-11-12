package methods;
import objects.OopsBoolean;
import objects.OopsInteger;
import objects.OopsObject;
import utils.OopsState;


public class OopsDistinct extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsInteger left = (OopsInteger) self;
		OopsInteger right = (OopsInteger) args[0];
		
		return new OopsBoolean(left.getValue() != right.getValue());
	}
	
}

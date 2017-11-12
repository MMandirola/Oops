package methods;
import objects.OopsInteger;
import objects.OopsObject;
import utils.OopsState;


public class OopsSum extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsInteger left = (OopsInteger) self;
		OopsInteger right = (OopsInteger) args[0];
		
		return new OopsInteger(left.getValue() + right.getValue());
	}
	
}

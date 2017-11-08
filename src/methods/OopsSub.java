package methods;
import objects.OopsInteger;
import objects.OopsMethod;
import objects.OopsObject;
import objects.OopsState;


public class OopsSub extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsInteger left = (OopsInteger) self;
		OopsInteger right = (OopsInteger) args[0];
		
		return new OopsInteger(left.getValue() - right.getValue());
	}
	
}
package methods;
import objects.OopsBoolean;
import objects.OopsMethod;
import objects.OopsObject;
import objects.OopsState;


public class OopsOr extends OopsMethod{
	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean left = (OopsBoolean) self;
		OopsBoolean right = (OopsBoolean) args[0];
		
		return new OopsBoolean(left.isValue() || right.isValue());
	}
}

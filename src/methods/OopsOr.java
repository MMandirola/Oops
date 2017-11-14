package methods;
import objects.OopsBoolean;
import objects.OopsObject;
import utils.OopsState;


public class OopsOr extends OopsMethod{
	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean left = (OopsBoolean) self;
		OopsBoolean right = (OopsBoolean) args[0];
		
		return new OopsBoolean(left.isValue() || right.isValue());
	}
}

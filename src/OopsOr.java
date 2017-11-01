
public class OopsOr extends OopsMethod{
	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args) {
		OopsBoolean left = (OopsBoolean) self;
		OopsBoolean right = (OopsBoolean) args[0];
		
		return new OopsBoolean(left.isValue() || right.isValue());
	}
}

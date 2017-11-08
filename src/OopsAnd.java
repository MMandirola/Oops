
public class OopsAnd extends OopsMethod{
	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean left = (OopsBoolean) self;
		OopsBoolean right = (OopsBoolean) args[0];
		
		return new OopsBoolean(left.isValue() && right.isValue());
	}
}

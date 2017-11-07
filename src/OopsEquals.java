
public class OopsEquals extends OopsMethod{

	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsInteger left = (OopsInteger) self;
		OopsInteger right = (OopsInteger) args[0];
		
		return new OopsBoolean(left.getValue() == right.getValue(), new OopsClass("Boolean", null));
	}
	
}

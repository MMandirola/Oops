
public class OopsSum extends OopsMethod{

	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args) {
		OopsInteger left = (OopsInteger) self;
		OopsInteger right = (OopsInteger) args[0];
		
		return new OopsInteger(left.getValue() + right.getValue());
	}
	
}

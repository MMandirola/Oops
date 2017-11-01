
public class OopsNot extends OopsMethod{

	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args) {
		OopsBoolean value = (OopsBoolean) self;
		
		return new OopsBoolean(!value.isValue());
	}
	
}
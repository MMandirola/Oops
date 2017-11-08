
public class OopsNot extends OopsMethod{

	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean value = (OopsBoolean) self;
		
		return new OopsBoolean(!value.isValue());
	}
	
}

public class OopsIf extends OopsMethod{

	@Override
	OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean condition = (OopsBoolean) self;
		OopsBlock block = (OopsBlock) args[0];
		if(condition.isValue()){
			return block.evaluate(state);
		}
		else{
			return null;
		}
	}

}

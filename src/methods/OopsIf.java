package methods;

import objects.OopsBlock;
import objects.OopsBoolean;
import objects.OopsObject;
import utils.OopsState;


public class OopsIf extends OopsMethod{

	@Override
	public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {
		OopsBoolean condition = (OopsBoolean) self;
		OopsBlock block = (OopsBlock) args[0];
		if(condition.isValue()){
			return block.evaluate(state);
		}
		else{
			block = (OopsBlock) args[1];
                        return block.evaluate(state);
		}       
	}

}

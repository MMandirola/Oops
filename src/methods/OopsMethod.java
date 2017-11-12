package methods;

import objects.OopsObject;
import utils.OopsState;



public abstract class OopsMethod {
	String selector;
	public abstract OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state);
}

package objects;

import classes.OopsClass;
import classes.OopsCodeClass;

/**
 *
 * @author emanuel
 */
public abstract class OopsCode extends OopsObject{
	@SuppressWarnings("unused")
	private OopsClass clase = OopsCodeClass.getInstance();
	
	public abstract OopsObject evaluate(OopsState state);
    
}

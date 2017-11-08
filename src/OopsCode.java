/**
 *
 * @author emanuel
 */
public abstract class OopsCode extends OopsObject{
	private OopsClass clase = OopsCodeClass.getInstance();
	
	public abstract OopsObject evaluate(OopsState state);
    
}

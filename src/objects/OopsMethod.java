package objects;



public abstract class OopsMethod {
	String selector;
	public abstract OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state);
}

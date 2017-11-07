
public class OopsValue extends OopsCode{
	private OopsObject value;
	@Override
	public OopsObject evaluate(OopsState state) {
		return value;
	}
	public OopsValue(OopsObject value, OopsClass clase) {
		super(clase);
		this.value = value;
	}
	public OopsObject getValue() {
		return value;
	}
	public void setValue(OopsObject value) {
		this.value = value;
	}	

}

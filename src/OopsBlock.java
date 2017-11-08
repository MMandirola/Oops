import java.util.HashMap;


public class OopsBlock extends OopsCode{
	OopsVariable[] vars;
	OopsSequence block;
	@Override
	public OopsObject evaluate(OopsState state) {
		HashMap<String,OopsObject> myState = new HashMap<>();
		for(OopsVariable var:vars){
			if(state.state.containsKey(var.getVar())){
				myState.put(var.getVar(), state.state.get(var.getVar()));
			}
		}
		return this.block.evaluate(new OopsState(myState));
	}// TODO Auto-generated constructor stub
	public OopsBlock(OopsVariable[] vars, OopsSequence block) {
		this.vars = vars;// TODO Auto-generated constructor stub
		this.block = block;
	}

}

import java.util.HashMap;


public class OopsBlock extends OopsCode{
	private OopsClass clase = OopsBlockClass.getInstance();
	
	OopsVariable[] vars;
	OopsCode block;
	@Override
	public OopsObject evaluate(OopsState state) {
		HashMap<String,OopsCell> myState = (HashMap<String, OopsCell>) state.state.clone();
		for(OopsVariable var:vars){
			OopsObject varValue = null;
			if(state.state.containsKey(var.getVar())){
				varValue = state.state.get(var.getVar()).value;
			}
			OopsCell cell = new OopsCell(varValue);
			myState.put(var.getVar(), cell);
		}
		return this.block.evaluate(new OopsState(myState));
	}// TODO Auto-generated constructor stub
	public OopsBlock(OopsVariable[] vars, OopsSequence block) {
		this.vars = vars;// TODO Auto-generated constructor stub
		this.block = block;
	}

}

package objects;


/**
 *
 * @author emanuel
 */
public class OopsAssigment extends OopsCode{
    OopsVariable var;
    OopsCode obj;
    
    public OopsAssigment(OopsVariable xvar, OopsCode xobj){
        this.var = xvar;
        this.obj = xobj;
    }

    @Override
    public OopsObject evaluate(OopsState state) {
        
       OopsObject res = obj.evaluate(state);
       OopsCell val = state.state.get(var.getVar());
       if(val == null){
    	   val = new OopsCell(null);
       }
       val.value = res;
       state.state.put(var.getVar(), val);
       return res;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
       OopsCell val = state.state.getOrDefault(var.getVar(), null);
       if(val == null){
    	   val = new OopsCell(null);
       }
       val.value = res;
       state.state.put(var.getVar(), val);
       return res;
    }
    
    
}

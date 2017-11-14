package objects;

import utils.OopsState;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuel
 */
public class OopsVariable extends OopsCode{

    private String var;
    
    
    public OopsVariable(String xvar){
        this.var = xvar;
    }
    
    
    /**
     * @return the var
     */
    public String getVar() {
        return var;
    }

    /**
     * @param var the var to set
     */
    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public OopsObject evaluate(OopsState state) {
        return state.state.get(var).value;
    }
    
    
    
    
    
}

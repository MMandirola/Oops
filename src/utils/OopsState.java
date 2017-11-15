package utils;


import java.util.HashMap;

import classes.OopsClass;
import classes.OopsIntegerClass;
import classes.OopsObjectClass;

import objects.OopsInteger;
import objects.OopsObject;


/**
 *
 * @author emanuel
 */
public class OopsState {
    
	public HashMap<String,OopsCell> state;
	public OopsState(HashMap<String, OopsCell> myState) {
		this.state = myState;
		state.put("Object", new OopsCell(OopsObjectClass.getInstance()));
	}
	public OopsState newState(){
		return new OopsState(new HashMap<String,OopsCell>());
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import classes.OopsClass;
import objects.OopsObject;
import utils.OopsState;

/**
 *
 * @author emanuel
 */
public class OopsNew extends OopsMethod{

    @Override
    public OopsObject evaluate(OopsObject self, OopsObject[] args, OopsState state) {   
        return new OopsObject((OopsClass)self);

    }
    
}

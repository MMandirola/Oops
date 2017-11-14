package tests.objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;

import objects.OopsAssigment;
import objects.OopsBlock;
import objects.OopsBoolean;
import objects.OopsCode;
import objects.OopsInteger;
import objects.OopsObject;
import objects.OopsValue;
import objects.OopsVariable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utils.OopsCell;
import utils.OopsState;
import static org.junit.Assert.*;

/**
 *
 * @author emanuel
 */
public class OopsIfTest {
    
    
    
//    OopsSequence seq = new OopsSequence([x,y,cinco,assig], objectt);
    

    
    @Test
    public void testScope() {
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsAssigment assign = new OopsAssigment(variable, value);
		HashMap<String, OopsCell> state = new HashMap<>();
		OopsVariable variable2 = new OopsVariable("test2");
		OopsValue value2 = new OopsValue(new OopsInteger(6));
		OopsAssigment assign2 = new OopsAssigment(variable, value);
		OopsBoolean condition = new OopsBoolean(true);
		OopsValue val1 = new OopsValue(assign);
		OopsValue val2 = new OopsValue(assign2);
		OopsBlock block1 = new OopsBlock(new OopsVariable[]{}, val1);
		OopsBlock block2 = new OopsBlock(new OopsVariable[]{}, val2);
		condition.respond("if", new OopsObject[] {block1, block2}, new OopsState(state));
		OopsCell trueway = state.get("test");
		OopsCell falseway = state.get("test2");
		assertTrue(falseway == null && trueway == null);

    }
    @Test
    public void testTrue() {		
    	OopsBoolean condition = new OopsBoolean(true);
		HashMap<String, OopsCell> state = new HashMap<>();
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsValue value2 = new OopsValue(new OopsInteger(4));
		OopsValue val1 = new OopsValue(value);
		OopsValue val2 = new OopsValue(value2);
		OopsBlock block1 = new OopsBlock(new OopsVariable[]{}, val1);
		OopsBlock block2 = new OopsBlock(new OopsVariable[]{}, val2);
		OopsValue result = (OopsValue) condition.respond("if", new OopsObject[] {block1, block2}, new OopsState(state));
		assertTrue(((OopsInteger) result.evaluate(null)).getValue() == 3);

    }
    @Test
    public void testFalse() {		
    	OopsBoolean condition = new OopsBoolean(false);
		HashMap<String, OopsCell> state = new HashMap<>();
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsValue value2 = new OopsValue(new OopsInteger(4));
		OopsValue val1 = new OopsValue(value);
		OopsValue val2 = new OopsValue(value2);
		OopsBlock block1 = new OopsBlock(new OopsVariable[]{}, val1);
		OopsBlock block2 = new OopsBlock(new OopsVariable[]{}, val2);
		OopsValue result = (OopsValue) condition.respond("if", new OopsObject[] {block1, block2}, new OopsState(state));
		assertTrue(((OopsInteger) result.evaluate(null)).getValue() == 4);

    }
    public OopsIfTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

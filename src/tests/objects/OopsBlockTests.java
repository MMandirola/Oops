package tests.objects;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import objects.OopsAssigment;
import objects.OopsBlock;
import objects.OopsBoolean;
import objects.OopsInteger;
import objects.OopsObject;
import objects.OopsValue;
import objects.OopsVariable;

import org.junit.Test;

import utils.OopsCell;
import utils.OopsState;

public class OopsBlockTests {
    @Test
    public void testScope() {
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsAssigment assign = new OopsAssigment(variable, value);
		HashMap<String, OopsCell> state = new HashMap<>();
		OopsValue val1 = new OopsValue(assign);
		OopsBlock block1 = new OopsBlock(new OopsVariable[]{}, val1);
		block1.evaluate(new OopsState(state));
		OopsCell trueway = state.get("test");
		assertTrue(trueway == null);

    }
    @Test
    public void testScope2() {
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsAssigment assign = new OopsAssigment(variable, value);
		HashMap<String, OopsCell> state = new HashMap<>();
		OopsCell cell = new OopsCell(new OopsValue(new OopsInteger(7)));
		state.put("test", cell);
		OopsBlock block1 = new OopsBlock(new OopsVariable[]{}, assign);
		block1.evaluate(new OopsState(state));
		OopsCell trueway = state.get("test");
		OopsInteger init = (OopsInteger) trueway.value;
		assertTrue(init.getValue() == 3);

    }
}

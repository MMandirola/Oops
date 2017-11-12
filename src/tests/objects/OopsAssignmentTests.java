package tests.objects;
import static org.junit.Assert.*;

import java.util.HashMap;

import objects.OopsAssigment;
import objects.OopsBoolean;
import objects.OopsCode;
import objects.OopsInteger;
import objects.OopsValue;
import objects.OopsVariable;

import org.junit.Test;

import utils.OopsCell;
import utils.OopsState;


public class OopsAssignmentTests {

	@Test
	public void testAssign() {
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsAssigment assign = new OopsAssigment(variable, value);
		HashMap<String, OopsCell> state = new HashMap<>();
		assign.evaluate(new OopsState(state));
		OopsInteger  actual = (OopsInteger) state.get("test").value;
		assertEquals((long) 3, (long) actual.getValue());
	}

}
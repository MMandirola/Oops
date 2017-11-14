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


public class OopsVariableTests {

	@Test
	public void testVariable() {
		OopsVariable variable = new OopsVariable("test");
		OopsCell value = new OopsCell(new OopsInteger(3));
		HashMap<String, OopsCell> state = new HashMap<>();
		state.put("test", value);
		OopsInteger actual = (OopsInteger) variable.evaluate(new OopsState(state));
		assertEquals((long) 3, (long) actual.getValue());
	}

}
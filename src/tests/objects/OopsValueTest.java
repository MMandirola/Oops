package tests.objects;

import static org.junit.Assert.*;

import java.util.HashMap;

import objects.OopsInteger;
import objects.OopsValue;

import org.junit.Test;

import utils.OopsCell;
import utils.OopsState;

public class OopsValueTest {

	@Test
	public void test() {
		OopsValue val = new OopsValue(new OopsInteger(3));
		OopsState state = new OopsState(new HashMap<String, OopsCell>());
		OopsInteger inti = (OopsInteger) val.evaluate(state);
		assertTrue(inti.getValue() == 3);
	}

}

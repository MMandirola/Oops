package tests.objects;
import static org.junit.Assert.*;
import objects.OopsBoolean;

import org.junit.Test;

import utils.OopsState;


public class OopsBooleanTests {

	@Test
	public void testNot() {
		OopsBoolean value = new OopsBoolean(false);
		OopsBoolean result = (OopsBoolean) value.respond("!", null, OopsState.newState());
		assertTrue(result.isValue());
	}
	@Test
	public void testNot2() {
		OopsBoolean value = new OopsBoolean(true);
		OopsBoolean result = (OopsBoolean) value.respond("!", null, OopsState.newState());
		assertTrue(!result.isValue());
	}
	@Test
	public void TestAnd() {
		OopsBoolean value1 = new OopsBoolean(true);
		OopsBoolean[] value2 = new OopsBoolean[]{ new OopsBoolean(true) };
		OopsBoolean result = (OopsBoolean) value1.respond("&&", value2, OopsState.newState());
		assertTrue(result.isValue());
	}
	
	@Test
	public void TestOr() {
		OopsBoolean value1 = new OopsBoolean(false);
		OopsBoolean[] value2 = new OopsBoolean[]{ new OopsBoolean(true) };
		OopsBoolean result = (OopsBoolean) value1.respond("||", value2, OopsState.newState());
		assertTrue(result.isValue());
	}

}

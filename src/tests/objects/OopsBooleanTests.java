package tests.objects;
import static org.junit.Assert.*;
import objects.OopsBoolean;
import objects.OopsState;

import org.junit.Test;


public class OopsBooleanTests {

	@Test
	public void testNot() {
		OopsBoolean value = new OopsBoolean(false);
		OopsBoolean result = (OopsBoolean) value.respond("!", null, new OopsState(null));
		assertTrue(result.isValue());
	}
	
	@Test
	public void TestAnd() {
		OopsBoolean value1 = new OopsBoolean(true);
		OopsBoolean[] value2 = new OopsBoolean[]{ new OopsBoolean(true) };
		OopsBoolean result = (OopsBoolean) value1.respond("&&", value2, new OopsState(null));
		assertTrue(result.isValue());
	}
	
	@Test
	public void TestOr() {
		OopsBoolean value1 = new OopsBoolean(false);
		OopsBoolean[] value2 = new OopsBoolean[]{ new OopsBoolean(true) };
		OopsBoolean result = (OopsBoolean) value1.respond("||", value2, new OopsState(null));
		assertTrue(result.isValue());
	}

}

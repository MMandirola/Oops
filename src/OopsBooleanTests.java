import static org.junit.Assert.*;

import org.junit.Test;


public class OopsBooleanTests {

	@Test
	public void testNot() {
		OopsBoolean value = new OopsBoolean(false, new OopsClass("Boolean",null));
		OopsBoolean result = (OopsBoolean) value.respond("!", null, new OopsState(null));
		assertTrue(result.isValue());
	}
	
	@Test
	public void TestAnd() {
		OopsBoolean value1 = new OopsBoolean(true, new OopsClass("Boolean",null));
		OopsBoolean[] value2 = new OopsBoolean[]{ new OopsBoolean(true, new OopsClass("Boolean",null)) };
		OopsBoolean result = (OopsBoolean) value1.respond("&&", value2, new OopsState(null));
		assertTrue(result.isValue());
	}
	
	@Test
	public void TestOr() {
		OopsBoolean value1 = new OopsBoolean(false, new OopsClass("Boolean",null));
		OopsBoolean[] value2 = new OopsBoolean[]{ new OopsBoolean(true, new OopsClass("Boolean",null)) };
		OopsBoolean result = (OopsBoolean) value1.respond("||", value2, new OopsState(null));
		assertTrue(result.isValue());
	}

}

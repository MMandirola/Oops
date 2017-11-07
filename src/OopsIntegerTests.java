import static org.junit.Assert.*;

import org.junit.Test;


public class OopsIntegerTests {

	@Test
	public void testAddTwoNumbers() {
		OopsInteger numberOne = new OopsInteger(2, new OopsClass("Integer",null));
		OopsInteger[] numberTwo = new OopsInteger[]{ new OopsInteger(2, new OopsClass("Integer",null))};
		
		OopsInteger result = (OopsInteger) numberOne.respond("+", numberTwo, null);
		
		assertEquals(result.getValue(),(Integer) 4);
	}
	
	@Test
	public void testSubstractTwoNumbers() {
		OopsInteger numberOne = new OopsInteger(2, new OopsClass("Integer",null));
		OopsInteger[] numberTwo = new OopsInteger[]{ new OopsInteger(1, new OopsClass("Integer",null))};
		
		OopsInteger result = (OopsInteger) numberOne.respond("-", numberTwo, null);
		
		assertEquals(result.getValue(),(Integer) 1);
	}
	
	@Test
	public void testMultiplyTwoNumbers() {
		OopsInteger numberOne = new OopsInteger(2, new OopsClass("Integer",null));
		OopsInteger[] numberTwo = new OopsInteger[]{ new OopsInteger(3, new OopsClass("Integer",null))};
		
		OopsInteger result = (OopsInteger) numberOne.respond("*", numberTwo, null);
		
		assertEquals(result.getValue(),(Integer) 6);
	}
	
	@Test
	public void testLTETwoNumbers() {
		OopsInteger numberOne = new OopsInteger(2, new OopsClass("Integer",null));
		OopsInteger[] numberTwo = new OopsInteger[]{ new OopsInteger(3, new OopsClass("Integer",null))};
		
		OopsBoolean result = (OopsBoolean) numberOne.respond("<=", numberTwo, null);
		
		assertTrue(result.isValue());
	}
	
	@Test
	public void testEqualsTwoNumbers() {
		OopsInteger numberOne = new OopsInteger(2, new OopsClass("Integer",null));
		OopsInteger[] numberTwo = new OopsInteger[]{ new OopsInteger(3, new OopsClass("Integer",null))};
		
		OopsBoolean result = (OopsBoolean) numberOne.respond("==", numberTwo, null);
		
		assertFalse(result.isValue());
	}
	
	@Test
	public void testDistinctTwoNumbers() {
		OopsInteger numberOne = new OopsInteger(2, new OopsClass("Integer",null));
		OopsInteger[] numberTwo = new OopsInteger[]{ new OopsInteger(3, new OopsClass("Integer",null))};
		
		OopsBoolean result = (OopsBoolean) numberOne.respond("!=", numberTwo, null);
		
		assertTrue(result.isValue());
	}

}

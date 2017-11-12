package tests.objects;

import static org.junit.Assert.*;

import java.util.HashMap;

import objects.OopsAssigment;
import objects.OopsCode;
import objects.OopsInteger;
import objects.OopsMessage;
import objects.OopsSequence;
import objects.OopsValue;
import objects.OopsVariable;

import org.junit.Test;

import utils.OopsCell;
import utils.OopsState;

public class OopsSequenceTests {

	@Test
	public void test() {
		OopsVariable variable = new OopsVariable("test");
		OopsValue value = new OopsValue(new OopsInteger(3));
		OopsAssigment assign = new OopsAssigment(variable, value);
		HashMap<String, OopsCell> state = new HashMap<>();
		OopsValue val = new OopsValue(new OopsInteger(6));
		OopsMessage msg = new OopsMessage("+",new OopsCode[]{assign}, val);
		OopsSequence sq = new OopsSequence(new OopsCode[]{assign,msg});
		OopsInteger inti = (OopsInteger) sq.evaluate(new OopsState(state));
		assertTrue(inti.getValue() == 9);
		
		
	}

}

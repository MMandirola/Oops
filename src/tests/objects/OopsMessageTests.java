package tests.objects;

import static org.junit.Assert.*;

import objects.OopsCode;
import objects.OopsInteger;
import objects.OopsMessage;
import objects.OopsSequence;
import objects.OopsValue;

import org.junit.Test;

import utils.OopsState;

public class OopsMessageTests {

	@Test
	public void test() {
		OopsValue assign = new OopsValue(new OopsInteger(4));
		OopsValue val = new OopsValue(new OopsInteger(6));
		OopsMessage msg = new OopsMessage("+",new OopsCode[]{assign}, val);
		OopsSequence sq = new OopsSequence(new OopsCode[]{assign,msg});
		OopsInteger inti = (OopsInteger) sq.evaluate(null);
		assertTrue(inti.getValue() == 10);
	}

}

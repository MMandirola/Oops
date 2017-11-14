package tests.objects;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import objects.OopsBoolean;
import objects.OopsInteger;
import objects.OopsObject;

import org.junit.Test;

import classes.OopsBooleanClass;
import classes.OopsClass;

public class OopsObjectTests {
	@Test
	public void classintegertest() {
		OopsInteger numberOne = new OopsInteger(2);
		
		OopsClass result = (OopsClass) numberOne.respond("class", new OopsObject[]{(OopsObject) numberOne}, null);
		assertTrue(result.name.equals("OopsIntegerClass"));
	}
	@Test
	public void classbooleantest() {
		OopsBoolean numberOne = new OopsBoolean(true);
		
		OopsClass result = (OopsClass) numberOne.respond("class", new OopsObject[]{(OopsObject) numberOne}, null);
		assertTrue(result.name.equals("OopsBooleanClass"));
	}
	@Test
	public void classclasstest() {
		OopsClass numberOne = OopsBooleanClass.getInstance();
		OopsClass result = (OopsClass) numberOne.respond("class", new OopsObject[]{(OopsObject) numberOne}, null);
		assertTrue(result.name.equals("OopsClass"));
	}
}

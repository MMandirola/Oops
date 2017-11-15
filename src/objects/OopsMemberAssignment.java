package objects;

import utils.OopsState;

public class OopsMemberAssignment extends OopsCode{

	OopsCode objectExp;
	String property;
	OopsCode expression;
	
	@Override
	public OopsObject evaluate(OopsState state) {
		OopsObject object = this.objectExp.evaluate(state);
		object.setProperty(this.property, expression.evaluate(state));
		return object;
	}
	
	public OopsMemberAssignment(OopsCode objectExp, String property, OopsCode expression){
		this.objectExp = objectExp;
		this.property = property;
		this.expression = expression;
	}

}

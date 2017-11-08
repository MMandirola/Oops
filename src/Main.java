
import java.util.HashMap;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello motorola");
                OopsState currentState = new OopsState(new HashMap<String, OopsObject>());
                OopsClass objectt = null;
                OopsClass intClass = new OopsClass("Integer",objectt);
                OopsClass assigmentClass = new OopsClass("Assigment",objectt);
                OopsClass valueClass = new OopsClass("value",objectt);
                OopsVariable x = new OopsVariable("x", intClass);
                OopsVariable y = new OopsVariable("y", intClass);
                OopsValue cinco = new OopsValue(new OopsInteger(5,intClass),valueClass);
                OopsAssigment assig = new OopsAssigment(x,cinco,assigmentClass);
                assig.evaluate(currentState);
                System.out.println(x.evaluate(currentState).clase.name);


	}

}

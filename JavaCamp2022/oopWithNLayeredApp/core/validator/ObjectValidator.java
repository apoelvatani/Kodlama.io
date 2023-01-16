package oopWithNLayeredApp.core.validator;

import java.util.ArrayList;
import oopWithNLayeredApp.entity.Object;

public class ObjectValidator implements Validator{

	@Override
	public boolean isValid(Object object, ArrayList<Object> objects) {
		boolean isValid = true;
		for(Object obj : objects) {
			if(obj.getName().equals(object.getName())) {
				isValid  = false;
				break;
			}
		}
		return isValid;
	}


}

package oopWithNLayeredApp.core.validator;

import java.util.ArrayList;
import oopWithNLayeredApp.entity.Object;

public interface Validator {
	 boolean isValid(Object object, ArrayList<Object> objects);
}

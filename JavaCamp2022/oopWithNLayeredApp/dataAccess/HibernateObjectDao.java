package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entity.Object;

public class HibernateObjectDao implements ObjectDao{

	@Override
	public void add(Object object) {
		System.out.println("Hibernate veri tabanına yeni " + object.getKind() + " eklendi : "  + object.getName());
	}

}

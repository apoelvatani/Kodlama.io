package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entity.Object;

public class JDBCObjectDao implements ObjectDao{

	@Override
	public void add(Object object) {
		System.out.println("JDBC veri tabanına yeni " + object.getKind() + " eklendi : " + object.getName());
	}

}

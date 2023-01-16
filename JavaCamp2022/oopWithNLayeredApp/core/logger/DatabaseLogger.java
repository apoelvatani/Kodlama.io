package oopWithNLayeredApp.core.logger;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veri tabanı üzerinde loglandı : " + data);
	}

}

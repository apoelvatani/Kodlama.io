package oopWithNLayeredApp.core.logger;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Email üzerinde loglandı : " + data);
		
	}

}

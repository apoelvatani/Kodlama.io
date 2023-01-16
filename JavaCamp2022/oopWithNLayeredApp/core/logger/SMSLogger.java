package oopWithNLayeredApp.core.logger;

public class SMSLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("SMS üzerinde loglandı : " + data);
	}

}

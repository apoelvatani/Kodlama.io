package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logger.Logger;
import oopWithNLayeredApp.dataAccess.ObjectDao;
import oopWithNLayeredApp.entity.Instructor;

public class InstructorManager {
	private ObjectDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(ObjectDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for(Logger logger : loggers)
			logger.log("Eğitmen eklendi.");
	}
}

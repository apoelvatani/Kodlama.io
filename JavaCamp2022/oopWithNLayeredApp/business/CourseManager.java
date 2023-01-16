package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logger.Logger;
import oopWithNLayeredApp.core.validator.Validator;
import oopWithNLayeredApp.dataAccess.ObjectDao;
import oopWithNLayeredApp.entity.Course;
import oopWithNLayeredApp.entity.Object;

public class CourseManager {
	private ObjectDao courseDao;
	private Validator validator;
	private Logger[] loggers;
	
	public CourseManager(ObjectDao courseDao, Logger[] loggers, Validator validator) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.validator = validator;
	}
	
	ArrayList<Object> courses = new ArrayList<Object>();
	
	public void add(Course course) throws Exception{
		if(course.getUnitPrice() >= 0 && validator.isValid(course, courses)) {
			courses.add(course);
			courseDao.add(course);
			for(Logger logger : loggers)
				logger.log("Kurs eklendi.");
		}
		else if(course.getUnitPrice() >= 0)
			throw new Exception("Aynı isimde birden fazla kurs olamaz...!");
		else if(validator.isValid(course, courses))
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz...!");
		else
			throw new Exception("Kursun fiyatı 0'dan küçük ve aynı isimde birden fazla kurs olamaz...!");
	}
}

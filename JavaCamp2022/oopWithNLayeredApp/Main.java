package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.business.InstructorManager;
import oopWithNLayeredApp.core.logger.EmailLogger;
import oopWithNLayeredApp.core.logger.FileLogger;
import oopWithNLayeredApp.core.logger.Logger;
import oopWithNLayeredApp.core.logger.SMSLogger;
import oopWithNLayeredApp.core.validator.ObjectValidator;
import oopWithNLayeredApp.dataAccess.HibernateObjectDao;
import oopWithNLayeredApp.dataAccess.JDBCObjectDao;
import oopWithNLayeredApp.entity.Category;
import oopWithNLayeredApp.entity.Course;
import oopWithNLayeredApp.entity.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new SMSLogger(), new EmailLogger(), new FileLogger()};
		
		InstructorManager instructorManager = new InstructorManager(new HibernateObjectDao(), loggers);
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Hasan Sabbah");
		instructorManager.add(instructor);
		
		CourseManager courseManager = new CourseManager(new JDBCObjectDao(), loggers, new ObjectValidator());
		Course course = new Course();
		course.setId(1);
		course.setName("Abdullah");
		course.setUnitPrice(0);
		courseManager.add(course);
		//Course course1 = new Course();
		//course1.setId(2);
		//course1.setName("Abdullah");
		//course1.setUnitPrice(-1);
		//courseManager.add(course1);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateObjectDao(), loggers, new ObjectValidator());
		Category category = new Category();
		category.setId(3);
		category.setName("Emrullah");
		categoryManager.add(category);
		//Category category1 = new Category();
		//category1.setId(3);
		//category1.setName("Emrullah");
		//categoryManager.add(category);
	}

}

package oopWithNLayeredApp.business;

import java.util.ArrayList;

import oopWithNLayeredApp.core.logger.Logger;
import oopWithNLayeredApp.core.validator.Validator;
import oopWithNLayeredApp.dataAccess.ObjectDao;
import oopWithNLayeredApp.entity.Category;
import oopWithNLayeredApp.entity.Object;

public class CategoryManager {
	private ObjectDao categoryDao;
	private Validator validator;
	private Logger[] loggers;
	
	public CategoryManager(ObjectDao categoryDao, Logger[] loggers, Validator validator) {
		this.categoryDao = categoryDao;
		this.validator = validator;
		this.loggers = loggers;
	}
	
	ArrayList<Object> categories = new ArrayList<Object>();
	
	public void add(Category category) throws Exception{
		if(validator.isValid(category, categories)) {
			categories.add(category);
			categoryDao.add(category);
			for(Logger logger : loggers)
				logger.log("Kategori eklendi.");
		}
		else
			throw new Exception("Aynı isimde birden fazla kategori bulunamaz...!");
	}
}

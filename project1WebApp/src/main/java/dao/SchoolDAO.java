package dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import models.School;

public interface SchoolDAO {
	School get(int id);
	List<School> get(String... conditions);
	School insert(School school);
	School update(int id, School school);
	School delete(int id);
}
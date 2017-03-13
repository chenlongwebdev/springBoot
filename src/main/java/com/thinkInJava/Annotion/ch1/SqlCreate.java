package com.thinkInJava.Annotion.ch1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SqlCreate {
	public static void main(String[] args) {
		System.out.println(sqlOutput(Student.class));
	}
	
	public static String sqlOutput(Class<?> c) {
		String tableName = "";
		List<String> columnDefs = new ArrayList<String>();
		DBTable dbTable = c.getDeclaredAnnotation(DBTable.class);
		if (null == dbTable) {
			System.out.println("no DBTable annotation in " + c.getName());
			return "no annotation";
		}
		if (dbTable.name().isEmpty()) {
			tableName = c.getSimpleName();
		} else {
			tableName = dbTable.name();
		}
		Field[] declaredFields = c.getDeclaredFields();
		for (Field field : declaredFields) {
			Annotation[] annos = field.getDeclaredAnnotations();
			if (annos.length == 0) {
				continue;
			}
			if (annos[0] instanceof SqlInt) {
				SqlInt sqlInt = (SqlInt) annos[0];
				String columnName = "";
				if (sqlInt.name().isEmpty()) {
					columnName = field.getName();
				} else {
					columnName = sqlInt.name();
				}
				columnDefs.add(columnName + " int " + getConstraints(sqlInt.constraint()));
			} else if (annos[0] instanceof SqlString) {
				SqlString sqlString = (SqlString) annos[0];
				String columnName = "";
				if (sqlString.name().isEmpty()) {
					columnName = field.getName();
				} else {
					columnName = sqlString.name();
				}
				columnDefs.add(
						columnName + " varchar(" + sqlString.value() + ")" + getConstraints(sqlString.constraint()));
			}

		}

		StringBuilder builder = new StringBuilder();
		builder.append("create table " + tableName + " ( ");
		for (String def : columnDefs) {
			builder.append("\n" + def + ",");
		}
		String createTable = builder.substring(0, builder.length() - 1) + "\n);";
		createTable = createTable.toUpperCase();
		return createTable;

	}

	public static String getConstraints(Constraint constraint) {
		String cons = "";
		if (!constraint.nullField()) {
			cons += " NOT NULL ";
		}
		if (constraint.primaryKey()) {
			cons += " PRIMARY KEY ";
		}
		if (constraint.unique()) {
			cons += " UNIQUE ";
		}
		return cons;
	}
	
	

}

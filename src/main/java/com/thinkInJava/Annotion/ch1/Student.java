package com.thinkInJava.Annotion.ch1;
@DBTable
public class Student {
	@SqlInt(constraint=@Constraint(primaryKey=true))
	private int id;
	@SqlInt(18)
	private int age;
	@SqlString(50)
	private String name;
	@SqlString(2)
	private String sex;

}

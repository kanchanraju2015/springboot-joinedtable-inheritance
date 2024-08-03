package com.briz.springboot_inheritance_joinedtable;

import jakarta.persistence.Entity;

@Entity(name="employee")
public class Employee extends Person
{
int salary;

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

}

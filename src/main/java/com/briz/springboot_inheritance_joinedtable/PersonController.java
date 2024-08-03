package com.briz.springboot_inheritance_joinedtable;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
@Autowired 
PersonRepository prepo;
@RequestMapping("/test")
public String test()
{
	return "this is joined inheritance test";
}
@RequestMapping("/save")
public String save()
{
	Person p=new Person(); p.setAge(56);p.setName("rahul");
	Employee e=new Employee();e.setName("manish");e.setAge(90);e.setSalary(12500);
	Student s=new Student();  s.setName("ajit");s.setMarks(45);s.setAge(17);
	prepo.save(p);
	prepo.save(e);
	prepo.save(s);
	return "Data saved";
}
@RequestMapping("/all")
public List<Person> allperson()
{
	return prepo.findAll();
}
}

package com.edureka.selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataUtil implements IDataUtil {

	public List<Employee> getPersonData() {
		Employee peter = new Employee("Peter", 24, "US");
		Employee keven = new Employee("keven", 29, "UK");
		Employee david = new Employee("David", 34, "London");
		Employee mark = new Employee("Mark", 44, "Africa");
		List<Employee> empList = new ArrayList<>();
		empList.add(peter);
		empList.add(keven);
		empList.add(david);
		empList.add(mark);
		return empList;

	}

	public Map<Integer, Person> getPersonMap() {
		Person steve = new Person("Steve", 24, "Noida");
		Person mortein = new Person("Mortein", 29, "Agra");
		Map<Integer, Person> personMap = new HashMap<>();
		personMap.put(1, steve);
		personMap.put(2, mortein);
		return personMap;

	}

}

package com.demo.rest.boot123;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

	@RequestMapping("/get")
	public List<Employee> getMethod() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(12, "utk");
		Employee emp2 = new Employee(13, "rtf");
		Employee emp3 = new Employee(14, "htk");
		Employee emp4 = new Employee(15, "arsh");
		Employee emp5 = new Employee(16, "shd");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		return list;
	}

}

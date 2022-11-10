package com.example.HIbernatePart2;

import com.example.HIbernatePart2.Entities.Employee;
import com.example.HIbernatePart2.Repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HIbernatePart2ApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;


	@Test
	void contextLoads() {
	}

	@Test
	public void CreateUser(){
		Employee emp1=new Employee("Prachi","Tomar", 10000L,22);
		Employee emp2=new Employee("Saloni","Bhatia", 2000L,21);
		Employee emp3=new Employee("Himanshi","Singh", 3000L,25);
		Employee emp4=new Employee("Muthbharti","G", 40000L,30);

		List<Employee>list=new ArrayList<>();

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		employeeRepo.saveAll(list);
	}

	@Test
	public void testfindAllSortedEmployees(){
		List<Object[]>list=employeeRepo.findAllSortedEmployees();
		for (Object[] objects:list) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Test
	public void testAllEmployees(){
		System.out.println(employeeRepo.findAll());
	}


	@Test
	@Transactional
	@Rollback(value = false)
	public void testdeleteEmployeeByMinSalary(){
		employeeRepo.deleteEmployeeByMinSalary();
	}
	@Test
	public void testFindEmployeeNameEndsWith(){
		List<Object[]>list=employeeRepo.FindEmployeeNameEndsWith();
		for (Object[] objects:list
			 ) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
		}
	}

	@Test
    @Transactional
	@Rollback(value = false)
	public void testDeleteEmployeeWithAge(){
		employeeRepo.DeleteEmployeeWithAge(25);
	}
}

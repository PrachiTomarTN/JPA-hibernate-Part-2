package com.example.HIbernatePart2.Repository;

import com.example.HIbernatePart2.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface EmployeeRepo extends PagingAndSortingRepository<Employee,Integer> {

    @Query("select firstname,lastname from Employee where salary>(select avg(salary) from Employee) order by age,salary desc")
    List<Object[]> findAllSortedEmployees();

    @Modifying
    @Query(value = "delete from employee where salary=(select min(salary) from (select * from employee) AS e2)",nativeQuery = true)
    void deleteEmployeeByMinSalary();
    @Query(value = "select id,firstname,age from employee where lastname like '%Singh'",nativeQuery = true)
    List<Object[]> FindEmployeeNameEndsWith();

    @Modifying
    @Query(value = "delete from employee where age>:age",nativeQuery = true)
    void DeleteEmployeeWithAge(@Param("age") Integer age);
}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manyyomany.facade.CompanyFacade;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DirtiesContext
@Transactional
@SpringBootTest
public class CompanyFacadeTest {
    @Autowired
   private CompanyDao companyDao;
    @Autowired
   private EmployeeDao employeeDao;
    @Autowired
   private CompanyFacade companyFacade;


@Test
void findCompanyByLetters(){

    Company company1 = new Company("Bang Olufsen");
    Company company2= new Company("Bowers  Wilkins");
    Company company3 = new Company("Bose");

    companyDao.save(company1);
    companyDao.save(company2);
    companyDao.save(company3);

    List<Company> foundCompany =companyFacade.getCompaniesByLetters("Olufsen");

    assertEquals(1, foundCompany.size());

    }

    @Test
    void findEmployeeByLetters(){
        Employee employee1 = new Employee("Mark", "Waltz");
        Employee employee2 = new Employee("Anna", "Waltz");
        Employee employee3 = new Employee("Adam", "Wallet");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        List<Employee> foundEmployee = companyFacade.getEmployeesByLetters("Waltz");

        assertEquals(2, foundEmployee.size());

    }
}

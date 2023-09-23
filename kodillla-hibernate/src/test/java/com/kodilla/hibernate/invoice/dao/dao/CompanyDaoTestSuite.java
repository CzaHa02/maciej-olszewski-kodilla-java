package com.kodilla.hibernate.invoice.dao.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    @Test
    void testSearchCompanyByValue() {
        Company dataMaesters = new Company("Data Maesters");
        Company semiMaesters = new Company("Semi Maesters");

        companyDao.saveAll(Arrays.asList(dataMaesters, semiMaesters));
        List<Company> foundCompanies = companyDao.retriveCompaniesWithValue("Dat ");
        Assertions.assertEquals("Data Maesters", foundCompanies);
    }
    @Test
    void testFindByLastName(){
        Employee employee1 = new Employee("Emanuel", "Esmal");
        Employee employee2 = new Employee("Anna","Waltz");

        employeeDao.saveAll(Arrays.asList(employee1,employee2));
        List<Employee> foundEmployee= employeeDao.retrieveByLastName("Esmal");
       assertTrue(foundEmployee.contains(employee1));

    }




    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);


        try {
           companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
           companyDao.deleteById(greyMatterId);
        } catch (Exception e) {

        }

    }
}
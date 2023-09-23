package com.kodilla.hibernate.manyyomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
@Autowired
    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }


    public List<Company> getCompaniesByLetters(String companyNameLetters){
        String searchCompany = "%" + companyNameLetters + "%";
        return companyDao.retriveCompaniesWithValue(searchCompany);

    }

    public List <Employee> getEmployeesByLetters(String employeeLastNameLetters){
        String searchEmployee= "%" + employeeLastNameLetters + "%";
        return employeeDao.retrieveByLastName(searchEmployee);
    }
}




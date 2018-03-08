/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.earnestpro.jobjunction.dao;

import com.earnestpro.jobjunction.employer.Employer;
import java.util.List;

/**
 *
 * @author Sanjay
 */
public interface EmployerDAO {
    int addEmployer(Employer employer);
    int deleteEmployer(int employer_id);
    List<Employer>getallEmployer();
    Employer getEmployerByID(int employer_id);
    int updateEmployer(int employer_id,Employer employer);
    
}

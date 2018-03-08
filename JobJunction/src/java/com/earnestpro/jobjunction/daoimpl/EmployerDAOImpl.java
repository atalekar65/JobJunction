
package com.earnestpro.jobjunction.daoimpl;

import com.earnestpro.jobjunction.dao.EmployerDAO;
import com.earnestpro.jobjunction.employer.Employer;
import com.earnestpro.jobjunction.utilities.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployerDAOImpl implements EmployerDAO{            
    @Override
    public int addEmployer(Employer employer) {
        int count=0;
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into employer (employer_name,employer_email,employer_contact,established_date,primary_business,employer_password,employer_id) values (?,?,?,?,?,?,AUTO_EMPLOYER.NEXTVAL)");
            preparedStatement.setString(1,employer.getEmployer_email());
            preparedStatement.setString(2,employer.getEmployer_name());
            preparedStatement.setString(3,employer.getEmployer_contact());
            java.util.Date established_date=new java.util.Date(employer.getEstablished_date());         
            preparedStatement.setDate(4, new Date(established_date.getYear(),established_date.getMonth(),established_date.getDay()));
            //preparedStatement.setString(4,employer.getEstablished_date());
            preparedStatement.setString(5,employer.getPrimary_business());
            preparedStatement.setString(6,employer.getEmployer_password());
            count =preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }


    @Override
    public int deleteEmployer(int employer_id) {
        int count=0;
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedstatement=connection.prepareStatement("delete from employer where employer_id= ?");
            preparedstatement.setInt(1,employer_id);
            count=preparedstatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Employer> getallEmployer() {
         List<Employer>employerList=null;
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement prepareStatement=connection.prepareStatement("select * from employer");
            ResultSet rs=prepareStatement.executeQuery();
            employerList=new ArrayList<Employer>();
            while(rs.next())
            {
                int employer_Id=rs.getInt(1);
                String employer_email=rs.getString(2);
                String employer_name=rs.getString(3);
                String employer_contact=rs.getString(4);
                String employer_date=rs.getString(5);
                String employer_business=rs.getString(6);
                String employer_password=rs.getString(7);
                Employer employer=new Employer(employer_Id,employer_email, employer_name, employer_contact, employer_date, employer_business, employer_password);
                employerList.add(employer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employerList;
    }

    @Override
    public Employer getEmployerByID(int employer_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateEmployer(int employer_id, Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}

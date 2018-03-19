
package com.earnestpro.jobjunction.daoimpl;

import com.earnestpro.jobjunction.dao.JobSeekerDAO;
import com.earnestpro.jobjunction.jobseeker.JobSeeker;
import com.earnestpro.jobjunction.utilities.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobSeekerDAOImpl implements JobSeekerDAO
{

    @Override
    public int addjobseeker(JobSeeker jobseeker) {
        int count=0;
        
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into   JobSeeker(candidate_name,candidate_gender,candidate_email,qualification,candidate_contact,candidate_dob,candidate_address,candidate_city,zip_code,candidate_experience,candidate_password,candidate_id) values (?,?,?,?,?,?,?,?,?,?,?,AUTO_JOBSEEKER.NEXTVAL)");
            preparedStatement.setString(1,jobseeker.getCandidate_name());
            preparedStatement.setString(2,jobseeker.getCandidate_gender());
            preparedStatement.setString(3,jobseeker.getCandidate_email());
            preparedStatement.setString(4,jobseeker.getQualification());
            preparedStatement.setString(5,jobseeker.getCandidate_contact());
            java.util.Date candidate_dob=new java.util.Date(jobseeker.getCandidate_dob());         
            preparedStatement.setDate(6, new Date(candidate_dob.getYear(),candidate_dob.getMonth(),candidate_dob.getDay()));
            preparedStatement.setString(7,jobseeker.getCandidate_address());
            preparedStatement.setString(8,jobseeker.getCandidate_city());
            preparedStatement.setString(9,jobseeker.getZip_code());
            preparedStatement.setInt(10,jobseeker.getCandidate_experience());
            preparedStatement.setString(11,jobseeker.getCandidate_password());
           
            count=preparedStatement.executeUpdate();
                
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
   
    }

    @Override
    public int deleteJobseeker(int candidate_id) {
        int count = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
            PreparedStatement preparedStatement = con.prepareStatement("delete from JobSeeker where candidate_id=?");
            preparedStatement.setInt(1,candidate_id);
            count=preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<JobSeeker> getallJobseeker() {
        List<JobSeeker> jobseekerList = null;
        try {
           
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select  candidate_id,candidate_name, candidate_gender, candidate_email, qualification, candidate_contact, candidate_dob ,candidate_address, candidate_city,zip_code, candidate_experience, candidate_password from jobseeker");
            ResultSet rs=preparedStatement.executeQuery();
            jobseekerList=new ArrayList<JobSeeker>();
            if(rs!=null)
            {
                while(rs.next()){
                    int candidate_id=rs.getInt(1);
                    String candidate_name=rs.getString(2);
                    String candidate_gender=rs.getString(3);
                    String candidate_email=rs.getString(4);
                    String qualification=rs.getString(5);
                    String candidate_contact=rs.getString(6);
                    String candidate_dob=rs.getString(7);
                    String candidate_address=rs.getString(8);
                    String candidate_city=rs.getString(9);
                    String zip_code=rs.getString(10);
                    int candidate_experience=rs.getInt(11);
                    String candidate_password=rs.getString(12);
                    JobSeeker jobseeker=new JobSeeker(candidate_id,candidate_name, candidate_gender, candidate_email, qualification, candidate_contact, candidate_dob, candidate_address, candidate_city, zip_code, candidate_experience, candidate_password);
                    jobseekerList.add(jobseeker);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return jobseekerList; 
    }

    @Override
    public JobSeeker getJobseekerByID(int candidate_id) {
                List<JobSeeker> jobseekerList = null;

        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select  * from jobseeker where candidate_id=?");
            preparedStatement.setInt(1, candidate_id);
            ResultSet rs=preparedStatement.executeQuery();
            jobseekerList=new ArrayList<JobSeeker>();
            if(rs!=null)
            {
                while(rs.next()){
                    int candidate_Id=rs.getInt(1);
                    String candidate_name=rs.getString(2);
                    String candidate_gender=rs.getString(3);
                    String candidate_email=rs.getString(4);
                    String qualification=rs.getString(5);
                    String candidate_contact=rs.getString(6);
                    String candidate_dob=rs.getString(7);
                    String candidate_address=rs.getString(8);
                    String candidate_city=rs.getString(9);
                    String zip_code=rs.getString(10);
                    int candidate_experience=rs.getInt(11);
                    String candidate_password=rs.getString(12);
                    JobSeeker jobseeker=new JobSeeker(candidate_Id,candidate_name, candidate_gender, candidate_email, qualification, candidate_contact, candidate_dob, candidate_address, candidate_city, zip_code, candidate_experience, candidate_password);
                    jobseekerList.add(jobseeker);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(jobseekerList.size()>0)
            return jobseekerList.get(0);
        else return null;
    }

    @Override
    public int updateJobseeker(int candidate_id, JobSeeker jobseeker) {
        int count =0;
        try {
            Connection connection  = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update jobseeker set candidate_password=? where candidate_id=?");
            preparedStatement.setString(1,jobseeker.getCandidate_password());
            preparedStatement.setInt(2,candidate_id);
            count=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    @Override
//    public String isValidate(String candidate_email, String candidate_password)
//    {  
//    int count=0;
//    String[] thisIsAStringArray = new String[5];
//    thisIsAStringArray[0] =candidate_email;
//    thisIsAStringArray[1] = candidate_password;
//        try {
//            //Connection connection=DBConnection.getConnection();
//            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from jobseeker where candidate_email  in (? )and candidate_password in (?) ");
//            preparedStatement.setString(1,candidate_email);
//            preparedStatement.setString(2,candidate_password);
//            count =preparedStatement.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//    }

////        } catch (SQLException ex) {
//            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//     @Override
    public String isValidate(String candidate_email, String candidate_password) {
        int count =0;
        try {           
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM jobseeker WHERE candidate_email  IN ( ? )and  candidate_password IN (?) ");
            preparedStatement.setString(1,candidate_email);
            preparedStatement.setString(2,candidate_password);
            count =preparedStatement.executeUpdate();
            if(count>0)
                System.out.println("records founds");
            else System.out.println("not found rec.");
//            preparedStatement.setString(2,jobseeker.getCandidate_password());
        
       
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//    

    @Override
    public boolean isUserValid(String candidate_email, String candidate_password) {
          
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM jobseeker WHERE candidate_email=? and candidate_password=?; ");
           // preparedStatement.setString(1,jobseeker.getCandidate_email());
            preparedStatement.setString(1,candidate_email);
            preparedStatement.setString(1,candidate_password);
             ResultSet rs=preparedStatement.executeQuery();
            //preparedStatement.setString(2,jobseeker.getCandidate_password());
            if(rs !=null)
            {
                return rs.next();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JobSeekerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("login failed");;
        return false;
    } //To change body of generated methods, choose Tools | Templates.
    }

    
   


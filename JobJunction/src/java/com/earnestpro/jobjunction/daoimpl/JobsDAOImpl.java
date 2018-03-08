
package com.earnestpro.jobjunction.daoimpl;

import com.earnestpro.jobjunction.dao.JobsDAO;
import com.earnestpro.jobjunction.jobs.Jobs;
import com.earnestpro.jobjunction.jobseeker.JobSeeker;
import com.earnestpro.jobjunction.utilities.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JobsDAOImpl implements JobsDAO
{

    @Override
    public int addjobs(Jobs jobs) {
         int count=0;
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("insert into   Jobs(job_id,date_jobrelease,date_jobend,company_name,job_industry,vacancy_status,no_vacancy,job_location,job_keyskills,job_description,job_designation,experience_required,employer_id) values (AUTO_JOBS.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?)");
            java.util.Date date_jobrelease=new java.util.Date(jobs.getDate_jobrelease());         
            preparedStatement.setDate(1, new Date(date_jobrelease.getYear(),date_jobrelease.getMonth(),date_jobrelease.getDay()));
            java.util.Date date_jobend=new java.util.Date(jobs.getDate_jobend());         
            preparedStatement.setDate(2, new Date(date_jobend.getYear(),date_jobend.getMonth(),date_jobend.getDay()));
            preparedStatement.setString(3,jobs.getCompany_name());
            preparedStatement.setString(4, jobs.getJob_industry());
            preparedStatement.setString(5, jobs.getVacancy_status());
            preparedStatement.setInt(6, jobs.getNo_vacancy());
            preparedStatement.setString(7, jobs.getJob_location());
            preparedStatement.setString(8, jobs.getJob_keyskills());
            preparedStatement.setString(9, jobs.getJob_description());
            preparedStatement.setString(10, jobs.getJob_designation());
            preparedStatement.setInt(11, jobs.getExperience_required());
            preparedStatement.setInt(12, jobs.getEmployer_id());
            count=preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(JobsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteJobs(int job_id) {
        int count=0;
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
            PreparedStatement preparedStatement = con.prepareStatement("delete from Jobs where job_id=?");
            preparedStatement.setInt(1,job_id);
            count=preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(JobsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Jobs> getallJobs() {
        List<Jobs>jobsList=null;
        try {
            
            Connection connection=DBConnection.getConnection();
            PreparedStatement preaparestatement=connection.prepareStatement("select * from jobs");
            ResultSet rs=preaparestatement.executeQuery();
            jobsList=new ArrayList<Jobs>();
            if(rs!=null)
            {
                while(rs.next()){
                    int job_id=rs.getInt(1);
                    String date_jobrelease=rs.getString(2);
                    String date_jobend=rs.getString(3);
                    String company_name=rs.getString(4);
                    String job_industry=rs.getString(5);
                    String vacancy_status=rs.getString(6);
                    int no_vacancy=rs.getInt(7);
                    String job_location=rs.getString(8);
                    String job_keyskills=rs.getString(9);
                    String job_description=rs.getString(10);
                    String job_designation=rs.getString(11);
                    int experience_required=rs.getInt(12);
                    int employer_id=rs.getInt(13);
                    Jobs jobs=new Jobs(job_id,date_jobrelease, date_jobend, company_name, job_industry, vacancy_status, no_vacancy, job_location, job_keyskills, job_description, job_designation, experience_required, employer_id);
                    jobsList.add(jobs);

                } }
        } catch (SQLException ex) {
            Logger.getLogger(JobsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jobsList;
    }

    @Override
    public Jobs getJobsByID(int job_id) {
             List<Jobs> jobsList=null;
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preaparedStatement=connection.prepareStatement("select * from jobs where job_id=?");
            preaparedStatement.setInt(1, job_id);
            ResultSet rs=preaparedStatement.executeQuery();
            jobsList=new ArrayList<Jobs>();
            if(rs!=null)
            {
                while(rs.next()){
                    int job_Id=rs.getInt(1);
                    String date_jobrelease=rs.getString(2);
                    String date_jobend=rs.getString(3);
                    String company_name=rs.getString(4);
                    String job_industry=rs.getString(5);
                    String vacancy_status=rs.getString(6);
                    int no_vacancy=rs.getInt(7);
                    String job_location=rs.getString(8);
                    String job_keyskills=rs.getString(9);
                    String job_description=rs.getString(10);
                    String job_designation=rs.getString(11);
                    int experience_required=rs.getInt(12);
                    int employer_id=rs.getInt(13);
                    Jobs jobs=new Jobs( job_Id,date_jobrelease, date_jobend, company_name, job_industry, vacancy_status, no_vacancy, job_location, job_keyskills, job_description, job_designation, experience_required, employer_id);
                    jobsList.add(jobs);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(JobsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(jobsList.size()>0)
            return jobsList.get(0);
        else return null;
    }

    @Override
    public int updateJobs(int job_id, Jobs jobs) {
        int count= 0;
        try {           
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("update jobs set company_name=? where job_id=?");
            preparedStatement.setString(1,jobs.getCompany_name());
            preparedStatement.setInt(2, job_id);
            count =preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JobsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return count;
    }

}

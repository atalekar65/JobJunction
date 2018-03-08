
package com.earnestpro.jobjunction.dao;
import com.earnestpro.jobjunction.jobseeker.JobSeeker;
import java.util.List;

public interface JobSeekerDAO {
    
    int addjobseeker(JobSeeker jobseeker);
    int deleteJobseeker(int candidate_id);
    List<JobSeeker>getallJobseeker();
    JobSeeker getJobseekerByID(int candidate_id);
    int updateJobseeker(int candidate_id,JobSeeker jobseeker);
    String  isValidate(String candidate_email,String candidate_password);
    String  isUserValid(String candidate_email,String candidate_password,JobSeeker jobseeker);
    
        
    
}

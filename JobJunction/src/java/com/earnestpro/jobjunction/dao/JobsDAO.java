
package com.earnestpro.jobjunction.dao;

import com.earnestpro.jobjunction.jobs.Jobs;
import java.util.List;


public interface JobsDAO {
    
    int addjobs(Jobs jobs);
    int deleteJobs(int job_id);
    List<Jobs>getallJobs();
    Jobs getJobsByID(int job_id);
    int updateJobs(int job_id,Jobs jobs);
    
}

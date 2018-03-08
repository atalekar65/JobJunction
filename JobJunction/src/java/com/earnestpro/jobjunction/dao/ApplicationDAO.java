
package com.earnestpro.jobjunction.dao;

import com.earnestpro.jobjunction.application.Application;
import com.earnestpro.jobjunction.utilities.DBConnection;
import java.util.List;


public interface ApplicationDAO {
    
    int addApplication(Application application);
    int deleteApplication(int application_id);
    List<Application>getallApplication();
    Application getApplicationByID(int application_id);
    int updateApplication(int application_id,Application application);

}

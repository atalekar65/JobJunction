
package com.earnestpro.jobjunction.daoimpl;

import com.earnestpro.jobjunction.application.Application;
import com.earnestpro.jobjunction.dao.ApplicationDAO;
import com.earnestpro.jobjunction.utilities.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ApplicationDAOImpl implements ApplicationDAO{

    @Override
    public int addApplication(Application application) {
        int count=0;
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparestatement=connection.prepareStatement("insert into application (job_id,candidate_id,date_application,application_id)values(?,?,?,AUTO_APPLICATION.NEXTVAL)");
            preparestatement.setInt(1,application.getJob_id());
            preparestatement.setInt(2,application.getCandidate_id());
            java.util.Date date_application=new java.util.Date(application.getDate_application());         
            preparestatement.setDate(3, new Date(date_application.getDay(),date_application.getMonth(),date_application.getYear()));
            count=preparestatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ApplicationDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteApplication(int application_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Application> getallApplication() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Application getApplicationByID(int application_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateApplication(int application_id, Application application) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}


package com.earnestpro.jobjunction.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
    
    
        public static Connection getConnection() {
        Connection con=null;
        try {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
         System.out.println("connection successfull");
//        Statement st=con.createStatement();
////        
//       ResultSet rs=st.executeQuery("select * from  JobSeeker");
////        
////        while(rs.next()){
////            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
////        }
////        con.close();
//        st.close();
//        rs.close();
        
        
        }
        catch(Exception e)
        {
                System.out.println("no connection established"+ e );
                
    }
            return con;
        }
}


// public static void main(String [] args)
//{
//    DBConnection cns=new DBConnection();
//    cns.dbCon();
//}}
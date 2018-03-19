
package com.earnestpro.jobjunction.jobseeker;
import java.util.Date;


public class JobSeeker {
    
    int    candidate_id,candidate_experience;
    String candidate_name,candidate_gender,candidate_email,qualification,candidate_address,candidate_city,candidate_password;
    String   candidate_dob,candidate_contact,zip_code;

    public JobSeeker(String candidate_name, String candidate_gender, String candidate_email, String qualification, String candidate_contact, String candidate_dob, String candidate_address, String candidate_city, int zip_code, int candidate_experience, String candidate_password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
      

    public int getCandidate_experience() {
        return candidate_experience;
    }

    public void setCandidate_experience(int candidate_experience) {
        this.candidate_experience = candidate_experience;
    }
    

    public String getCandidate_contact() {
        return candidate_contact;
    }

    public void setCandidate_contact(String candidate_contact) {
        this.candidate_contact = candidate_contact;
    }

    //public JobSeeker(String abhay, String male, String abhaygmailcom, String bscIT, int i, String string, String kandivali, String mumbai, int i0, int i1, String abhay12345) {
      ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    public int getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(int candidate_id) {
        this.candidate_id = candidate_id;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
    

    public String getCandidate_name() {
        return candidate_name;
    }

    public void setCandidate_name(String candidate_name) {
        this.candidate_name = candidate_name;
    }

    public String getCandidate_gender() {
        return candidate_gender;
    }

    public void setCandidate_gender(String candidate_gender) {
        this.candidate_gender = candidate_gender;
    }

    public String getCandidate_email() {
        return candidate_email;
    }

    public void setCandidate_email(String candidate_email) {
        this.candidate_email = candidate_email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCandidate_address() {
        return candidate_address;
    }

    public void setCandidate_address(String candidate_address) {
        this.candidate_address = candidate_address;
    }

    public String getCandidate_city() {
        return candidate_city;
    }

    public void setCandidate_city(String candidate_city) {
        this.candidate_city = candidate_city;
    }

    public String getCandidate_password() {
        return candidate_password;
    }

    public void setCandidate_password(String candidate_password) {
        this.candidate_password = candidate_password;
    }

    public String getCandidate_dob() {
        return candidate_dob;
    }

    public void setCandidate_dob(String candidate_dob) {
        this.candidate_dob = candidate_dob;
    }


    
     public JobSeeker(String candidate_name,String candidate_gender, String candidate_email,String qualification,String candidate_contact,String candidate_dob,String candidate_address,String candidate_city,String zip_code,int candidate_experience,String candidate_passsword) {        
        this.candidate_name=candidate_name;
        this.candidate_gender=candidate_gender;
        this.candidate_email=candidate_email;
        this.qualification=qualification;
        this.candidate_contact=candidate_contact;
        this.candidate_dob=candidate_dob;
        this.candidate_address=candidate_address;
        this.candidate_city=candidate_city;
        this.zip_code=zip_code;
        this.candidate_experience=candidate_experience;
        this.candidate_password=candidate_passsword;
//        this.candidate_id = candidate_id;
    }  
//     public JobSeeker(String candidate_name,String candidate_gender, String candidate_email,String qualification,String candidate_contact,String candidate_dob,String candidate_address,String candidate_city,String zip_code,int candidate_experience,String candidate_passsword,int candidate_id) {        
//        this.candidate_name=candidate_name;
//        this.candidate_email=candidate_email;
//        this.candidate_gender=
//        this.qualification=qualification;
//        this.candidate_contact=candidate_contact;
//        this.candidate_dob=candidate_dob;
//        this.candidate_address=candidate_address;
//        this.candidate_city=candidate_city;
//        this.zip_code=zip_code;
//        this.candidate_experience=candidate_experience;
//        this.candidate_password=candidate_passsword;
//        this.candidate_id = candidate_id;
//    }   
     public JobSeeker(int candidate_id,String candidate_name,String candidate_gender, String candidate_email,String qualification,String candidate_contact,String candidate_dob,String candidate_address,String candidate_city,String zip_code,int candidate_experience,String candidate_passsword) {        
        this.candidate_id = candidate_id;
        this.candidate_name=candidate_name;
        this.candidate_email=candidate_email;
        this.candidate_gender=candidate_gender;
        this.qualification=qualification;
        this.candidate_contact=candidate_contact;
        this.candidate_dob=candidate_dob;
        this.candidate_address=candidate_address;
        this.candidate_city=candidate_city;
        this.zip_code=zip_code;
        this.candidate_experience=candidate_experience;
        this.candidate_password=candidate_passsword;
        
    }  
     public JobSeeker(int candidate_id,String candidate_password )
     {
         this.candidate_id=candidate_id;
         this.candidate_password=candidate_password;
     }
     public JobSeeker(String candidate_email,String candidate_password )
     {
         this.candidate_email=candidate_email;
         this.candidate_password=candidate_password;
}}

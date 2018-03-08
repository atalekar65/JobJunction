
package com.earnestpro.jobjunction.employer;
import java.util.Date;

public class Employer {
    int    employer_id;
    String employer_name,employer_email,primary_business,employer_password;
    String   employer_contact;
    String   established_date;

    public int getEmployer_id() {
        return employer_id;
    }

    public void setEmployer_id(int employer_id) {
        this.employer_id = employer_id;
    }

    public String getEmployer_name() {
        return employer_name;
    }

    public void setEmployer_name(String employer_name) {
        this.employer_name = employer_name;
    }

    public String getEmployer_email() {
        return employer_email;
    }

    public void setEmployer_email(String employer_email) {
        this.employer_email = employer_email;
    }

    public String getPrimary_business() {
        return primary_business;
    }

    public void setPrimary_business(String primary_business) {
        this.primary_business = primary_business;
    }

    public String getEmployer_password() {
        return employer_password;
    }

    public void setEmployer_password(String employer_password) {
        this.employer_password = employer_password;
    }

    public String getEmployer_contact() {
        return employer_contact;
    }

    public void setEmployer_contact(String employer_contact) {
        this.employer_contact = employer_contact;
    }

    public String getEstablished_date() {
        return established_date;
    }

    public void setEstablished_date(String established_date) {
        this.established_date = established_date;
    }
    
    public Employer(String employer_email,String employer_name,String employer_contact,String established_date,String primary_business,String employer_password)
    {
      this.employer_email=employer_email;
      this.employer_name=employer_name;
      this.employer_contact=employer_contact;
      this.established_date=established_date;
      this.primary_business=primary_business;
      this.employer_password=employer_password;
    }
     public Employer(int employer_id,String employer_email,String employer_name,String employer_contact,String established_date,String primary_business,String employer_password)
    {
      this.employer_id=employer_id;
      this.employer_email=employer_email;
      this.employer_name=employer_name;
      this.employer_contact=employer_contact;
      this.established_date=established_date;
      this.primary_business=primary_business;
      this.employer_password=employer_password;
    }
    

   
}


package com.earnestpro.jobjunction.jobs;
import java.util.Date;


public class Jobs {
    int    job_id,no_vacancy,experience_required,employer_id;
    String company_name,job_industry,vacancy_status,job_location,job_keyskills,job_description,job_designation;
    String date_jobrelease,date_jobend;

    

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getNo_vacancy() {
        return no_vacancy;
    }

    public void setNo_vacancy(int no_vacancy) {
        this.no_vacancy = no_vacancy;
    }

    public int getExperience_required() {
        return experience_required;
    }

    public void setExperience_required(int experience_required) {
        this.experience_required = experience_required;
    }

    public int getEmployer_id() {
        return employer_id;
    }

    public void setEmployer_id(int employer_id) {
        this.employer_id = employer_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob_industry() {
        return job_industry;
    }

    public void setJob_industry(String job_industry) {
        this.job_industry = job_industry;
    }

    public String getVacancy_status() {
        return vacancy_status;
    }

    public void setVacancy_status(String vacancy_status) {
        this.vacancy_status = vacancy_status;
    }

    public String getJob_location() {
        return job_location;
    }

    public void setJob_location(String job_location) {
        this.job_location = job_location;
    }

    public String getJob_keyskills() {
        return job_keyskills;
    }

    public void setJob_keyskill(String job_keyskills) {
        this.job_keyskills = job_keyskills;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getJob_designation() {
        return job_designation;
    }

    public void setJob_designation(String job_designation) {
        this.job_designation = job_designation;
    }

    public String getDate_jobrelease() {
        return date_jobrelease;
    }

    public void setDate_jobrelease(String date_jobrelease) {
        this.date_jobrelease = date_jobrelease;
    }

    public String getDate_jobend() {
        return date_jobend;
    }

    public void setDate_jobend(String date_jobend) {
        this.date_jobend = date_jobend;
    }
    
    public Jobs(String date_jobrelease,String date_jobend,String company_name,String job_industry,String vacancy_status,int no_vacancy,String job_location,String job_keyskills,String job_description,String job_designation,int experience_required,int employer_id)
    {
    //this.job_id=jo_id;
    this.date_jobrelease=date_jobrelease;
    this.date_jobend=date_jobend;
    this.company_name=company_name;
    this.job_industry=job_industry;
    this.vacancy_status=vacancy_status;
    this.no_vacancy=no_vacancy;
    this.job_location=job_location;
    this.job_keyskills=job_keyskills;
    this.job_description=job_description;
    this.job_designation=job_designation;
    this.experience_required=experience_required;
    this.employer_id=employer_id;
    }
        public Jobs(int job_id,String date_jobrelease,String date_jobend,String company_name,String job_industry,String vacancy_status,int no_vacancy,String job_location,String job_keyskills,String job_description,String job_designation,int experience_required,int employer_id)
    {
    this.job_id=job_id;
    this.date_jobrelease=date_jobrelease;
    this.date_jobend=date_jobend;
    this.company_name=company_name;
    this.job_industry=job_industry;
    this.vacancy_status=vacancy_status;
    this.no_vacancy=no_vacancy;
    this.job_location=job_location;
    this.job_keyskills=job_keyskills;
    this.job_description=job_description;
    this.job_designation=job_designation;
    this.experience_required=experience_required;
    this.employer_id=employer_id;
    }
        public Jobs(int job_id,String company_name){
            this.job_id=job_id;
            this.company_name=company_name;
        }

    
}

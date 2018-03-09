
package com.earnestpro.jobjunction.utilities;
import com.earnestpro.jobjunction.application.Application;
import com.earnestpro.jobjunction.dao.ApplicationDAO;
import com.earnestpro.jobjunction.dao.EmployerDAO;
import com.earnestpro.jobjunction.utilities.DBConnection;
import com.earnestpro.jobjunction.dao.JobSeekerDAO;
import com.earnestpro.jobjunction.dao.JobsDAO;
import com.earnestpro.jobjunction.daoimpl.ApplicationDAOImpl;
import com.earnestpro.jobjunction.daoimpl.EmployerDAOImpl;
import com.earnestpro.jobjunction.daoimpl.JobSeekerDAOImpl;
import com.earnestpro.jobjunction.daoimpl.JobsDAOImpl;
import com.earnestpro.jobjunction.employer.Employer;
import com.earnestpro.jobjunction.jobs.Jobs;
import com.earnestpro.jobjunction.jobseeker.JobSeeker;
import java.util.List;



public class Test {
    
    public static void main(String [] args)
    {
      JobSeekerDAO jobseekerdao=new JobSeekerDAOImpl();
      JobsDAO jobsdao=new JobsDAOImpl();
      EmployerDAO employerdao=new EmployerDAOImpl();
      ApplicationDAO applicationdao=new ApplicationDAOImpl();
// ******************************* job seeker ********************************************
        int count=jobseekerdao.addjobseeker(new JobSeeker("sanket","FEMALE","sanket@gmail.com","msc","8219138378","17/08/1980","banglore","karnataka","123456",10,"55957"));
        if(count>0)System.out.println("Record added Successfully");
        else System.out.println("Record Failed to get added");
        
//        int count=jobseekerdao.deleteJobseeker(6);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
          
//        List<JobSeeker> jobseekerList =jobseekerdao.getallJobseeker();
//        for(JobSeeker jb : jobseekerList){
//       
//            System.out.println(jb.getCandidate_id()+" | "+jb.getCandidate_name() + " | " + jb.getCandidate_gender() + "|  " + jb.getCandidate_email() + "  |  " + jb.getQualification() +" | "+ jb.getCandidate_contact() +" | "+ jb.getCandidate_dob() +"  |  "+ jb.getCandidate_address() +" | "+ jb.getCandidate_city() +" | "+ jb.getZip_code()+" | "+ jb.getCandidate_experience() +"  |  "+ jb.getCandidate_password());
//        }
//    }  
           
//            JobSeeker jb = jobseekerdao.getJobseekerByID(3);
//            System.out.println("candidate ID : "+jb.getCandidate_id()+" | "+"candidate name : "+jb.getCandidate_name() + " | " +"candidate gender : "+ jb.getCandidate_gender() + "|  " +"candidate email : "+ jb.getCandidate_email() + "  |  " +"candidate qualification : "+ jb.getQualification() +" | "+"contact no. : "+ jb.getCandidate_contact() +" | "+ "date of birth : "+jb.getCandidate_dob() +"  |  "+"address : "+ jb.getCandidate_address() +" | "+ "city : "+jb.getCandidate_city() +" | "+ "zip code : "+jb.getZip_code()+" | "+ "experience : "+jb.getCandidate_experience() +"  |  "+ "password : "+jb.getCandidate_password());
    
//                JobSeeker jobseeker=new JobSeeker(3,"akshay7887");
//                int count =jobseekerdao.updateJobseeker(3, jobseeker);
//                if(count >0)
//                    System.out.println("record updated successfully");
//                else System.out.println("failed to update the records");

//********************************************************************************************************************
                //String count=jobseekerdao.isValidate("JOHN@GMAIL.COM", "change1235");
 //********************************************************************************************************************             
//                if(count.equals("jessiew78@gmail.com")){
//                    System.out.println("records found");}
//                else{ System.out.println("not found");}
//                JobSeeker jobseeker=new JobSeeker("jessiew78@gmail.com", "jew7892");
//                  String  count=jobseekerdao.isUserValid("jessiew78@gmail.com", "jew7892", jobseeker);
//                  if(count.equals("jew7892"))
//                      System.out.println("records found");
//                  else System.out.println("not found");
                  
                  //jobseekerdao.isValidate("jessiew78@gmail.com","jew7892");
                //String count=jobseekerdao .isValidate("jessiew78@gmail.com","jew7892");
                //JobSeeker jobseeker=jobseekerdao.isValidate("jew7892","jessiew78@gmail.com");
        
//    }
// ******************************************   jobs *********************************************
//        int count=jobsdao.addjobs(new Jobs("1/1/2017","2/2/2017","TCS","IT","CLOSE",8,"MUMBAI","CONSULTANT","NA","NA",10,100003));
//        if(count>0)System.out.println("Record added Successfully");
//        else System.out.println("Record Failed to get added");

//        int count=jobsdao.deleteJobs(1001);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
//            List<Jobs> jobsList =jobsdao.getallJobs();
//            for(Jobs jb : jobsList){
//       
//            System.out.println(jb.getJob_id()+" | "+jb.getDate_jobrelease() + " | " + jb.getDate_jobend() + "|  " + jb.getCompany_name() + "  |  " + jb.getJob_industry() +" | "+ jb.getVacancy_status() +" | "+ jb.getNo_vacancy() +"  |  "+ jb.getJob_location() +" | "+ jb.getJob_keyskills() +" | "+ jb.getJob_description()+" | "+ jb.getJob_designation() +"  |  "+ jb.getExperience_required()+"|"+jb.getEmployer_id());
//        }
//           Jobs jb = jobsdao.getJobsByID(1001);
//           System.out.println("job ID : "+jb.getJob_id()+" | "+"date of job release : "+jb.getDate_jobrelease()+ " | " +"date of jobs ends : "+ jb.getDate_jobend()+ "|  " +"company name : "+ jb.getCompany_name() + "  |  " +"industry : "+ jb.getJob_industry() +" | "+"vacancy status : "+ jb.getVacancy_status() +" | "+ "no of vacancy : "+jb.getNo_vacancy() +"  |  "+"job location : "+ jb.getJob_location() +" | "+ "key skills : "+jb.getJob_keyskills() +" | "+ "description : "+jb.getJob_description()+" | "+ "designation : "+jb.getJob_designation() +"  |  "+ "experience required : "+jb.getExperience_required()+"|"+"employer id :"+jb.getEmployer_id());
//            Jobs jb=new Jobs(1000,"tcs");
//            int count= jobsdao.updateJobs(1000,jb);
//            if(count >0)
//            System.out.println("Record Updated Successfully");
//            else System.out.println("Record Failed to get updated");
//********************************************************************************************************************
//            int count=employerdao.addEmployer(new Employer("aksha@gmail.com","akshy","123467890","11/11/2011","accountancy","akshay789"));
//            if(count>0)
//                System.out.println("Records inserted successfully");
//            else System.out.println("Records failed to get inserted");

//            int count=employerdao.deleteEmployer(100001);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");

        
//        List<Employer> employerList =employerdao.getallEmployer();
//        for(Employer ee : employerList){
//       
//            System.out.println(ee.getEmployer_id()+" | "+ee.getEmployer_email()+ " | " + ee.getEmployer_name() + "|  " + ee.getEmployer_contact() + "  |  " + ee.getEstablished_date() +" | "+ ee.getPrimary_business() +" | "+ ee.getEmployer_password()); 
//        }


//**********************************************************************************************************************
//    int count=applicationdao.addApplication(new Application(1000,1,"11/11/2011"));
//    if(count>0)
//            System.out.println("records inserted succesfully");
//    else System.out.println("records failed to get updated");
////   }
//date format
}}

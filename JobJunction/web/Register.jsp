<%-- 
    Document   : Register
    Created on : 16 Mar, 2018, 9:57:09 PM
    Author     : Sanjay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <script>
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>


   <script type="text/javascript">
        function IsValidZipCode(Zipcode) {
            var isValid = /^[0-9]{5}(?:-[0-9]{4})?$/.test(zip);
            if (isValid)
                alert('Valid ZipCode');
            else {
                alert('Invalid ZipCode');
            }
        }
    </script><script>
 $(function(){
	$.validator.setDefaults({
		highlight: function(element){
			$(element)
			.closest('.form-group')
			.addClass('has-error')
		},
		unhighlight: function(element){
			$(element)
			.closest('.form-group')
			.removeClass('has-error')
		}
	});
	
	$.validate({
		rules:
		{	
                    
                    
		    password: "required",
			birthDate: "required",
			weight: {
			    required:true,
			    number:true
			},
			height:  {
			    required:true,
			    number:true
			},
			email: {
				required: true,
				email: true
			}
		},
			messages:{			
				email: {
				required: true,
				email: true
			}
		},
				password: {
					required: " Please enter password"
				},
				birthDate: {
					required: " Please enter birthdate"
				},
				email: {
					required: ' Please enter email',
					email: ' Please enter valid email'
				},
				weight: {
					required: " Please enter your weight",
					number: " Only numbers allowed"
				},
				height: {
					required: " Please enter your height",
					number: " Only numbers allowed"
				},
			}
			
	});
});  -->
            </script>

            
        <style>
            body {
     background: url('https://static-communitytable.parade.com/wp-content/uploads/2014/03/rethink-target-heart-rate-number-ftr.jpg') fixed;
    background-size: cover;
}

*[role="form"] {
    max-width: 530px;
    padding: 15px;
    margin: 0 auto;
    border-radius: 0.3em;
    background-color: #f2f2f2;
}

*[role="form"] h2 { 
    font-family: 'Open Sans' , sans-serif;
    font-size: 40px;
    font-weight: 600;
    color: #000000;
    margin-top: 5%;
    text-align: center;
    text-transform: uppercase;
    letter-spacing: 4px;
}


        </style>
    </head>
    <body>
        <div class="container">
            <form method="post" action="signin.do" class="form-horizontal" role="form">
                <h2>Registration</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">First Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="First Name" class="form-control" name="candidate_name" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastName" class="col-sm-3 control-label">Last Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="lastName" placeholder="Last Name" class="form-control" name="candidate_name" autofocus>
                    </div>
                </div>             
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email* </label>
                    <div class="col-sm-9">
                        <input type="email" id="email" placeholder="Email" class="form-control" name="candidate_email">
                    </div>
                </div>
                <div class="form-group">
                    <label for="Address" class="col-sm-3 control-label">Address</label>
                    <div class="col-sm-9">
                        <input type="text" id="Address" placeholder="Address" class="form-control" name="candidate_address" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">City</label>
                    <div class="col-sm-3">
                    <select class="custom-select" name="candidate_city">
                      <option>Mumbai</option>
                    <option>Delhi</option>
                <option>Kolkata</option>
                <option>Kolkata</option>
                <option>Chennai</option>
                <option>Bengaluru</option><option>Ahmadabad</option>
                <option>Hyderabad</option><option>Pune</option>
                <option>Lucknow</option> <option>Nagpur</option>
                 <option>Indore</option><option>Kochi</option>
                <option>Nashik</option><option>Agra</option>
                <option>Rajkot</option> <option>Chandigarh</option>
                 <option>Bhopal</option> <option>Jaipur</option>  
                    </select></div>
                </div>
                  <div class="form-group">
                    <label for="ZipCode" class="col-sm-3 control-label">Zip Code</label>
                    <div class="col-sm-9">
                        <input type="ZipCode" id="phoneNumber" placeholder="ZipCode" class="form-control" name="zip_code">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password*</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" placeholder="Password" class="form-control" name="canadidate_password">
                    </div>
                </div>
<!--                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Confirm Password*</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" placeholder="Password" class="form-control">
                    </div>
                </div>-->
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth*</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" class="form-control" name="candidate_dob">
                    </div>
                </div>
                 <div class="form-group">
                    <label for="Experience" class="col-sm-3 control-label">Experience</label>
                    <div class="col-sm-9">
                        <input type="Experience" id="phoneNumber" placeholder="Experience in years" class="form-control" name="candidate_experience">
                    </div>
                </div>
                 <div class="form-group">
                    <label for="Qualification" class="col-sm-3 control-label">Qualification</label>
                    <div class="col-sm-9">
                        <input type="Qualification" id="phoneNumber" placeholder="Qualification" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-3 control-label">Contact number</label>
                    <div class="col-sm-9">
                        <input type="phoneNumber" id="phoneNumber" placeholder="Phone number" class="form-control" name="candidate_contact">
                        <span class="help-block">Your phone number won't be disclosed anywhere </span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio" value="FEMALE" name="candidate_gender">FEMALE
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio" value="MALE" name="candidate_gender">MALE
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <span class="help-block">*Required fields</span>
                    </div>
                </div>
                <input type="submit" class="btn btn-primary btn-block" value="submit" >
            </form> <!-- /form -->
        </div> <!-- ./container -->
    </body>
</html>

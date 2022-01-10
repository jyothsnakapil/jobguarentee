package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//test data
		public String url="http://127.0.0.1/orangehrm-2.6/login.php";
		public String un="admin";
		public String pw="admin123";
		public String uk="0005";
		public String FN="jyothsna";
		public String LN="Kapil";
		
	//objects
		public String txt_loginname="txtUserName";
		public String txt_password="txtPassword";
		public String btn_login="Submit";
		public String link_logout="Logout";
	//adding employee
		
		public String txt_PIM="PIM";
	    public String txt_add="Add Employee";
	    public String txt_id="txtEmployeeId";
        public String txt_lastname="txtEmpLastName";
        public String txt_firstname="txtEmpFirstName";
        public String btn_add ="btnEdit";
        
   //delete employee
        
      // public String loc_code="Emp. ID";
       //public String loc_name="0017";
}



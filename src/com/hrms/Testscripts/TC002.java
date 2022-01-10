package com.hrms.Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC002 {
	@Test
	public class tc002 {
		//Test case Steps
		//public static void main(String args[]) throws Exception 
		public void tc002() {
			DOMConfigurator.configure("log4j.xml");
			General g=new General();
		    g.openApplication();
		    g.login();
		    g.addEmp();
		    g.logout();
		    g.closeApplication();
	}
	}
}

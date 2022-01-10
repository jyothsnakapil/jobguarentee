package com.hrms.Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC001 {
	@Test
	public class tc001 {
		//test Case Steps
		//public static void main (String args[]) throws Exception{
		
		public void tc001() throws Exception{
			DOMConfigurator.configure("log4j.xml");

		General g=new General();
		    g.openApplication();
		    g.login();
		    g.logout();
		    g.closeApplication();
			}
	}
}

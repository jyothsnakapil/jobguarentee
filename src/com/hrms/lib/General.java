package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class General extends Global {

public void openApplication() {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tamat\\Downloads\\chromedriver_win32 (1)\\ChromeDriver.exe");
   driver = new ChromeDriver();
	driver.navigate().to(url);
	
	System.out.println("Application opened");
	
	System.out.println("Application opened");
}
public void closeApplication() {
	

	System.out.println("Application Closed");
}
public void login() {
	
    driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login completed");
	}

	public void logout () {
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
}	
	public void addEmp() {
		//mouseover on pim mainmenu
		WebElement element = driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		//clicking on addemployee submenu link
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Employee added");
		
		//enter into frame
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.id("txtEmployeeId")).sendKeys("0005");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("kapil");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("jyothsna");
		driver.findElement(By.id("btnEdit")).click();
		// exit frame
		
		driver.switchTo().defaultContent();
	}

		public void delEmp() {
			driver.switchTo().frame("rightMenu");
			
       // select from dropdown
		Select drpdwn = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/select")));
		drpdwn.selectByVisibleText("Emp. ID");	
		driver.findElement(By.name("loc_name")).sendKeys("0064");
		driver.findElement(By.className("plainbtn")).click();
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();
		// exit frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
	
				
	
	}
}		


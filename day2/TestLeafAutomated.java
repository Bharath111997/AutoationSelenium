package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafAutomated {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Narayanan");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bharath");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("N");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("The Salesforce");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Test Engineer");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("41140");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ind");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("To create new leads");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Make it fast");
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6380687835");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("To create lead");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bharathyadav0802@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.facebook.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Bharath");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Narayanan");
	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.4,Defence colony");
	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Nandhivaram");
	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chengalpattu");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603 202");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("02");
	    
	}

}

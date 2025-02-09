package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//*[text() ='Leads']")).click();
		driver.findElement(By.xpath("//*[text() ='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Surenth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Suren");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Entering the automation testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("prsurenth@gmail.com");
		Select select = new Select (driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//*[text() ='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Entering the automation testing");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[text() ='Duplicate Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Cognizant");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Surenth R");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		

	}

}

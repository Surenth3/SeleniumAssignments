package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assign21Mar12 {

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
		driver.findElement(By.xpath("//*[text() ='Contacts']")).click();
		driver.findElement(By.xpath("//*[text() ='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Surenth");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Suren");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Suren");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Entering the automation testing");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("prsurenth@gmail.com");
		Select select = new Select (driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//*[text() ='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Entering the automation testing");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}

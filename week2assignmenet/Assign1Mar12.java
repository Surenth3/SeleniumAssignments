package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assign1Mar12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Monika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Cinderalla");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("gramathainokki@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("gramathainokki@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Suren$190295");
		Select select = new Select (driver.findElement(By.id("day")));
		select.selectByVisibleText("19");		
		Select select2 = new Select (driver.findElement(By.id("month")));
		select2.selectByVisibleText("Feb");	
		Select select3 = new Select (driver.findElement(By.id("year")));
		select3.selectByVisibleText("1995");	
		driver.findElement(By.xpath("//label[@class ='_58mt']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				

	}

}

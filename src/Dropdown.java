import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\I348224\\Desktop\\Software\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

     driver.findElement(By.id("glsctl00_mainContent_ddl_originStation1_CTNR")).click();

     driver.findElement(By.xpath("//input[@value='Bengaluru (BLR)']")).click();

    Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
System.out.println("Hello");






}



}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\I348224\\Desktop\\Software\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
        
          
	System.setProperty("webdriver.edge.driver", "C:\\Users\\I348224\\Desktop\\Software\\edgedriver_win64\\msedgedriver.exe");
          WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		

	}

}

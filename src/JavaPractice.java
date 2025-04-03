import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPractice {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//System.setProperty("WebDriver.chrome.driver", "D:\\Software\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cygnet.hrinnova.com/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//aaa
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(30000);
		driver.close();
		
		
		
				
		
		
		// TODO Auto-generated method stub

	}

}

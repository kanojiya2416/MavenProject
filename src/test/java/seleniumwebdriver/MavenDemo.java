package seleniumwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class MavenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Login");
//			ChromeDriver driver=new ChromeDriver();
//			WebDriver driver=new ChromeDriver();
//		    WebDriver driver=new EdgeDriver(); 

		    WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			
			String title = driver.getTitle();
			if(title.equals("Google")) {
				System.out.println("Test Passed");
			}else {
				System.out.println("Test Failed");
			}
			
//			driver.close();
			
	}

}
	
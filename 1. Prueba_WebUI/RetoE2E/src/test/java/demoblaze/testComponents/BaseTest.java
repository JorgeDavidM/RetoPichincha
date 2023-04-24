package demoblaze.testComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import demoblaze.pages.HomePage;

public class BaseTest {

	public WebDriver driver;
	public HomePage homepage;

	// Declare Browser
	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\demoblaze\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Jorge Muñoz\\eclipse-workspace\\RetoE2E\\src\\test\\resources\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeMethod
	public HomePage launchApplication() throws IOException {
		driver = initializeDriver();
		homepage = new HomePage(driver);
		homepage.goToSite();
		return homepage;
	}
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	
	

}

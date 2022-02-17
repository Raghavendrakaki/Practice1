package MyFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public WebDriver driver;
	// public WebDriverWait eWait;
	public Properties prop;

	public WebDriver initializeWebdriver() {

		propObject();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"F:\\selenium\\workspace\\my_selenium_practice\\MyFramework\\src\\main\\java\\MyFramework\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("start-maximized");
			options.addArguments("–disable-notifications");
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\new\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					"F:\\selenium\\new\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "F:\\selenium\\new\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	}

	public void quitDriver() {

		driver.quit();
	}

	public void propObject() {

		prop = new Properties();
	}

	public void statiWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void implicitWaitInSeconds(long time) {
		try {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

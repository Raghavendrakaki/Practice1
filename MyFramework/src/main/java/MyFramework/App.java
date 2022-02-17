package MyFramework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App extends Base {
	LoginPage loginPage;

	@Test(dataProvider = "myData")
	public void test(String usernam, String password) throws IOException {
		System.out.println("Hello World!");

		initializeWebdriver();
		driver.get("https://eportal.htcindia.com/_index.php");
		loginPage = new LoginPage(driver);
		loginPage.login(usernam, password);
		statiWait(7000);

		quitDriver();

	}

	@DataProvider
	public Object[][] myData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "20524";
		data[0][1] = "Raghava525525#";
		data[1][0] = "20524";
		data[1][1] = "Raghava525525#";

		return data;

	}
	
	public static void main(String[] args) {
		String s = "Raghava kaki";
		
		String r = "12345";
		Integer a=Integer.valueOf(r);
		Integer b=new Integer(10);
		b=Integer.parseInt(r);
		System.out.println(String.valueOf(50)+1);
		//System.out.println(Integer.valueOf(s));
		System.out.println(Integer.valueOf(r)+b);
		//System.out.println(Integer.parseInt(s));
		System.out.println(Integer.parseInt(r)+b);
	}
}

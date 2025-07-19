package PractionRemote;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteWorkTest {
	@Test
	public void remotingTest() throws MalformedURLException {
		ChromeOptions option=new ChromeOptions();
		URL ipAdd = new URL("http://192.168.226.1:4444");
		RemoteWebDriver driver=new RemoteWebDriver(ipAdd,option);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}

package Selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class qw {

	public static void main(String[] args) {
// TODO Auto-generated method stub

//SSl certificates

//Desired capabilities=
//general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

//Belows to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver(c);

	}

}
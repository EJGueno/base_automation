package cursoselenium;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	private WebDriver driver;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com.br");
				
	}
	@After
	public void Finaliza() {

		driver.quit();
	}
	
	@Test
	public void teste() {
		//System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
//		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//driver.manage().window().setPosition(new Point(100,100));
//		//driver.manage().window().setSize(new Dimension(1024,768));
//		driver.manage().window().maximize();
				System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
			
	}
}

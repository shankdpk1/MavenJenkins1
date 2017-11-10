package PrintMsg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class printMsg {
	
	@Test
	public void printMethod() {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shash\\eclipse-workspace\\JarFiles\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println("title is "+driver.getTitle());
		driver.quit();
		
		//i am converting to testng xml file which will be run from POM file
	
		//now there are 3 ways to run this code -
		//1 - run testNG xml as testNG
		//2 - run POM xml as maventest
		//3 - from cmd. goto run->cmd. change directry to the project. run mvn -version to check version/maven availability. mvn clean. mvn install will intall dependencies if not installed already and run the code. mvn test will directly run the code
}

}
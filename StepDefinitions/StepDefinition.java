import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
		public static WebDriver driver;
		Boolean iselementpresent;
		
		//Scenario: 01 - Successful Login to application and verifies the fields in application
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
			File file = new File("./browser/geckodriver.exe"); 
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://openweathermap.org/");
	        driver.findElement(By.xpath(".//img[@alt='openweathermap']"));
			}
		
		@When("^Application logo is displaying$")//Verifying whether logo(image) is displaying properly or not
		public void CheckImage() throws Exception {
			WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@alt,'openweathermap')]"));	        
			Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
			if (!ImagePresent) {
				System.out.println("Image not displayed.");
			} else {
				System.out.println("Image displayed.");
			}
		}

		@Then("^On Page load all the labels and fields are loaded as expected$")//Verifying whether labels are displayed properly or not
		public void verifying_labels() throws Throwable {
			driver.get("https://openweathermap.org/");
			iselementpresent = driver.findElements(By.xpath(".//*[@class='navbar-brand']")).size()!= 0;
			   	if (iselementpresent == true) {
				   System.out.print("\nOpenWeatherMap"+" Is Present On The Page");
			   	} else {
				   System.out.print("\nOpenWeatherMap"+" Is Not Present On The Page");
			   	}
				
			   	iselementpresent = driver.findElements(By.linkText("//a[text()=' Sign In']")).size()!= 0;
				if (iselementpresent == true) {
				    System.out.print("\nSign In"+" Is Present On The Page");
				} else {
				    System.out.print("\nSign In"+" Is Not Present On The Page");
				}
				   
				 iselementpresent = driver.findElements(By.xpath("//a[text()=' Sign Up']")).size()!= 0;
				 if (iselementpresent == true){
					 System.out.print("\nSign Up"+" button Is Present On The Page");
				 } else {
					 System.out.print("\nSign Up"+" button Is Not Present On The Page");
				 }
			   
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Weather']")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Weather field"+" Is Present On The Page");
				 } else {
					 System.out.print("\nWeather"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Maps ']")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Maps field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n Maps field"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Guide']")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Guide field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n Guide field"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.xpath("//a[text()='API']")).size()!= 0;
				 if (iselementpresent == true){
					 System.out.print("\n API field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n API field"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Price']")).size()!= 0;
				 if (iselementpresent == true)
				   {
				    System.out.print("\n Price field"+" Is Present On The Page");
				 }else {
					System.out.print("\n Price field"+"Is Not Present On The Page");
				 }
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Partners']")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Partners field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n Partners field"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Stations']")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Stations field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n Stations field"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.xpath("//a[text()='Widgets']")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Widgets field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n Widgets field"+"Is Not Present On The Page");
				 }
				 
				 iselementpresent = driver.findElements(By.partialLinkText("Blog")).size()!= 0;
				 if (iselementpresent == true) {
					 System.out.print("\n Blog field"+" Is Present On The Page");
				 } else {
					 System.out.print("\n Blog field"+"Is Not Present On The Page");   
				 }
				 iselementpresent = driver.findElements(By.xpath("//*[@id='searchform']/button")).size()!= 0;
				 if (iselementpresent == true){
					 System.out.print("\n Search Button "+" Is Present On The Page");
				 } else {
					 System.out.print("\n Search Button "+"Is Not Present On The Page");
				    
				   }
				 
				 //Verifying whether center test is available on screen or not.
				 iselementpresent = driver.findElements(By.xpath("//*[@class='widget__title']")).size()!= 0;
				 
				 if (iselementpresent == true){
				    System.out.print("\n Title of the page "+" Is Present On The Page");
				 } else {
				    System.out.print("\n Title of the page "+"Is Not Present On The Page");   
				   }
				 try {
					 assertEquals(driver.findElement(By.xpath("//*[@class='widget__title']")).getText(), "Current weather and forecasts in your city" );
					 System.out.println("Displaying 'Current weather and forecasts in your city'");
					 //assertTrue(driver.findElement(By.xpath("//*[@class='widget__title']")).getText().equals("foo"));
				 } catch (Error e) {
						 System.out.println("'Current weather and forecasts in your city' is not displayed as expected");
			     }
			   
				 iselementpresent = driver.findElements(By.xpath("//*[@id='searchform']/span/button/i")).size()!= 0;
				 
				 if (iselementpresent == true) {
				    System.out.print("\n Current location link "+" Is Present On The Page");
				 } else {
				    System.out.print("\n Current location label "+"Is Not Present On The Page");   
				 }
				 quit();
			}
		
		//Scenario: 02 - Searching for invalid location
		
		@Given("^Providing input value to the location input field$")
		public void inputting_location() throws Throwable {
			File file = new File("./browser/geckodriver.exe"); 
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://openweathermap.org/");
			driver.findElement(By.xpath("//input[@placeholder='Your city name']")).sendKeys("abcgherkin");
			System.out.println("provided input value");
		}
		
		@Then("^Searching for the invalid location and verifying$")
		public void searching_InvalidLocation() throws Throwable {
			driver.findElement(By.xpath("//*[@id='searchform']/button")).click();
			try {//verifying whether location is available or not
				 assertEquals(driver.findElement(By.xpath("//div[contains(@class,'alert alert-warning')]")).getText(), "Not found" );
				 System.out.println("Displaying 'Not found'");
			} catch (Error e) {
				System.out.println("'Not Found' message is not displayed on screen ");
			}
			quit();
		}
		//Scenario:03 - Searching for valid location details
		
		@Given("^Providing input value to the location field$")
		public void searching_ValidLocation() throws Throwable {
			File file = new File("./browser/geckodriver.exe"); 
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://openweathermap.org/");
			iselementpresent = driver.findElements(By.xpath("//input[@placeholder='Your city name']")).size() != 0;
			if (iselementpresent) {
				//driver.findElement(By.xpath("//input[@placeholder='Your city name']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Your city name']")).sendKeys("Bangalore");
			} else {
				System.out.println(driver.findElement(By.xpath("//input[@placeholder='Your city name']")) + "Location Entered is not found");
			}
		}
		
		@Then("^Searching for the location provided$")
		public void clicking_searchbutton() throws Throwable{
			iselementpresent = driver.findElements(By.xpath("//*[@id='searchform']/button")).size()!= 0;
			if (iselementpresent == true){
				driver.findElement(By.xpath("//*[@id='searchform']/button")).click();
				System.out.print("\n Search Button "+" Is Present On The Page and can perform click ");
			}else{
				System.out.print("\n Search Button "+"Is Not Present On The Page and click is not performed");
		    }
		}
		
		@And("^Verifying for the location searches$")
		public void verifying_ValidLocation() throws Throwable{
			try {//verifying whether location is available or not
				System.out.println(driver.findElement(By.xpath("//*[@id='search_str']")).getText());
				 assertEquals(driver.findElement(By.xpath("//*[@id='search_str']")).getText(), driver.findElement(By.linkText("Bangalore, IN")));
				 System.out.println("Displaying Location which is searched for");
				 } catch (Error e) {
					 System.out.println("Valid location is not displaying as per searches");
				 }
			quit();
		}
		
		//Scenario:04 - Access Customer Support page in new tab(Window Handles)
		
		@Given("^Look for the support center and performed click$")
		public void support_center_pageNavigation() throws Throwable {
			File file = new File("./browser/geckodriver.exe"); 
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://openweathermap.org/");
			driver.findElement(By.xpath("//span[contains(text(),'Support Center')]")).click();
		}
		
		@Then("^Handles tabs upon successful navigation$")
		public void window_handles() throws Throwable {
			String parent = driver.getWindowHandle();// It will return the parent window name as a String
			Set <String> s1 = driver.getWindowHandles();

			// Now we will iterate using Iterator
			Iterator<String> I1 = s1.iterator();

			while(I1.hasNext()) {
				String child_window=I1.next();
			// Here we will compare if parent window is not equal to child window then we will close
			    if(!parent.equals(child_window)){
				   driver.switchTo().window(child_window);
				   System.out.println(driver.switchTo().window(child_window).getTitle());
				   assertEquals(driver.findElement(By.xpath("//*[@id='support-header']")).getText(), "Support Center");
				   System.out.println("Support Center is displaying properly");
				   driver.close();
			   }
			}
			driver.switchTo().window(parent);
		}
		//Scenario: 05 - Close the browser on successful validation
		
		@When("^Close the browser$")
		public void quit() throws Throwable {
			driver.quit();
		}

		@Then("^Message displayed Successfully closed the application$")
		public void message_displayed_Logout_Successfully() throws Throwable {
	        System.out.println("Application closed Successfully");
		}

}

package com.selenium.maven.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonMainTest {

	
	
	
	public static void main(String[] args) {
		
		
		// declaration and instantiation of objects/variables
    	
		System.setProperty("webdriver.gecko.driver", "F:\\selenium/driverfiles/geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","F:\\selenium/driverfiles/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://www.amazon.com";
        String expectedTitle = "";
        String actualTitle = ""; //null
        actualTitle.length();

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
System.out.println(actualTitle);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(actualTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	}
}

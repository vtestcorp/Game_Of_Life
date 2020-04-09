	package com.GOL.tests;
	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;

	import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

	import org.testng.annotations.Test;

	import org.testng.annotations.Test;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Test;
	
		import org.testng.annotations.AfterMethod;
	import org.testng.annotations.Test;
	
		import org.testng.annotations.AfterMethod;
	

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.remote.CapabilityType;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.testng.Assert;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.AfterSuite;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.BeforeSuite;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Listeners;
		import org.testng.annotations.Parameters;
		import org.testng.annotations.Test;
		import org.testng.asserts.SoftAssert;
		import com.relevantcodes.extentreports.LogStatus;
import com.GOL.base.Base;
import com.GOL.pages.Gameoflife_page;
import com.GOL.util.Utility;
import com.TestNG_listener.CustomListener;

		@Listeners(CustomListener.class)
		public class GOL_newgame extends Base
		{	
			Gameoflife_page Gol;
			SoftAssert sa = new SoftAssert();
			
			public GOL_newgame()
			{
				super();
			}
			
			
			
			@BeforeSuite
			public void createReport()
			{
				create_ext_Report();
			}
			
			@BeforeMethod
			public void setup() throws URISyntaxException {
				initialization();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Gol	 = new Gameoflife_page();
			
					
			}
			
			@Test(priority=1,enabled=true)
			public void Game1() throws Throwable
			{
		    	 create_ext_Test("Check Next Generation for second rowlivecell");
		    	 Gol.New_gamebutton.click();
		    	 Gol.test1_cell1.click();
		    	 Gol.test1_cell2.click();
		    	 Gol.test1_cell3.click();
		    	 Gol.Go_button.click();
		    	 
		    	
		    	 
				if(Gol.Next_genMessage.isDisplayed()){
					et.log(LogStatus.PASS, "Game Started",et.addScreenCapture(pass("Game Started")));
					}
					
						else {
							et.log(LogStatus.FAIL, "Click on Go Button Not Started the Game",et.addScreenCapture(failed("Game Not started")));}
						
					List<WebElement> count=driver.findElements(By.xpath("//table//tbody//tr//td//input[@type=\"hidden\"]"));
				if(count.size()==3)
				{
					et.log(LogStatus.PASS, "Selected Cells live in Next Generation",et.addScreenCapture(pass("Next Generation")));
					}
					
						else {
							et.log(LogStatus.FAIL, "Selected Cells not live in Next Generation",et.addScreenCapture(failed("Game Not started")));}
						
				}
			
			
			@Test(priority=2,enabled=true)
			public void Game2() throws Throwable
			{
		    	 create_ext_Test("Check Next Generation for firstrowfirstcell");
		    	 Gol.New_gamebutton.click();
		    	 Gol.test2_cell1.click();
		    	 Gol.Go_button.click();
		    	 
		    	
		    	 
				if(Gol.Next_genMessage.isDisplayed()){
					et.log(LogStatus.PASS, "Game Started",et.addScreenCapture(pass("Game Started")));
					}
					
						else {
							et.log(LogStatus.FAIL, "Click on Go Button Not Started the Game",et.addScreenCapture(failed("Game Not started")));}
						
					List<WebElement> count=driver.findElements(By.xpath("//table//tbody//tr//td//input[@type=\"hidden\"]"));
				if(count.size()==1)
				{
					et.log(LogStatus.PASS, "Selected Cells live in Next Generation",et.addScreenCapture(pass("Next Generation")));
					}
					
						else {
							et.log(LogStatus.FAIL, "Selected Cells not live in Next Generation",et.addScreenCapture(failed("Game Not started")));}
				
				Gol.Go_button.click();
				List<WebElement> count1=driver.findElements(By.xpath("//table//tbody//tr//td//input[@type=\"hidden\"]"));

				if(count1.size()==0)
				{
					et.log(LogStatus.PASS, "Selected Cells died in Next Generation",et.addScreenCapture(pass("Next Generation")));
					}
					
						else {
							et.log(LogStatus.FAIL, "Selected Cells not died in Next Generation",et.addScreenCapture(failed("Game Not started")));}
					
				}
			
			
//					
//			@AfterMethod
//			public void tearDown()
//			{
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				driver.close();
//			}
			
			@AfterSuite
			public void closeReport()
			{
				close_ext_Report();
			}

		}





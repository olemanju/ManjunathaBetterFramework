package com.itc.test;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.itc.pages.HomePage;
import com.itc.pages.LoginPage;
import com.itc.util.BaseTestObject;

public class HomePageTest extends BaseTestObject
{

	HomePage objhomepage=null;
	LoginPage objloginpage=null;
	boolean flag=false;
	
	
	@org.testng.annotations.Parameters({"browserType"})
	@Test(priority=0, enabled=true,groups="regression")
	public void verifyHomePage() throws Exception
	{
		try 
		{
			objhomepage = new HomePage(driver);
			flag = objhomepage.isSiteLogoDisplayed();
		    Assert.assertTrue(flag, "Site logo is not displayed");
		    objloginpage = objhomepage.clickOnLogin();
		    flag = objloginpage.isLoginPageDisplayed();
		    Assert.assertTrue(flag, "Login page is not displayed");
		    
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED CLICK ON SITELOGO AND VERFIY PAGETITLE TESTCASE" + "\n clickOnSiteLogoAndCheckThePageTitle" +e.getLocalizedMessage());
		}

		}
		
	}
	


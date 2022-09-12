package com.browserstack.technicalonboarding.percy.tests;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.browserstack.technicalonboarding.percy.Pages.HomePAge;

public class TestHomePage extends TestRunner{

	@Test
	public void testHomePage()
	{
		HomePAge pg=new HomePAge(driver);
		pg.goToUrl();
		assertEquals(driver.getTitle(), pg.getHomeTitle());
		percy.snapshot("Home Page Test",Arrays.asList(new Integer[]{375, 480, 720, 1280, 1440, 1920}));
		//Single element Snapshot Example
		percy.snapshot("Single DOM Element",Arrays.asList(new Integer[]{375, 480, 720, 1280, 1440, 1920}),
				null,false,null,"#signupModalButton");
	}
}

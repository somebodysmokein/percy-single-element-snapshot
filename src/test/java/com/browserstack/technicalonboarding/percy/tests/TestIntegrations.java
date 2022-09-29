package com.browserstack.technicalonboarding.percy.tests;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.browserstack.technicalonboarding.percy.Pages.IntegrationsPage;

public class TestIntegrations extends TestRunner{

	@Test
	public void testIntegrationsPage()
	{
		IntegrationsPage pg=new IntegrationsPage(driver);
		pg.goToUrl();
		assertEquals(driver.getTitle(), pg.getIntegrationsTitle());
		percy.snapshot("Integrations Page Test",Arrays.asList(new Integer[]{375, 480, 720, 1280, 1440, 1920}));

		percy.snapshot("Single DOM Element-Integrations",Arrays.asList(new Integer[]{375, 480, 720, 1280, 1440, 1920}),
				null,false,null,"#post-2245 > div:nth-child(1) > div > div > div > article > div > div > div.text-section.col-xs-12.no-pad.col-sm-6.col-md-8.col-lg-8 > div:nth-child(2) > div > div > a");
		
	}	
}

package controller;

import org.testng.annotations.Test;

import BusinessComponents.BusinessLogic;

public class ContronTestNG {
	@Test
	public void runTest()
	{
		BusinessLogic.BrowserLaunch();
		BusinessLogic.selectLanguage();
		BusinessLogic.takeScreenShot(6);
	}

}

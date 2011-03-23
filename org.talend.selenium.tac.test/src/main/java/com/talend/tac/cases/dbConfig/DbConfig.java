package com.talend.tac.cases.dbConfig;

import com.talend.tac.base.Base;
import static org.testng.Assert.*;

public class DbConfig extends Base {

	/**
	 * the process of dbConfig(input url,userName,userPasswd,driver, then check
	 * it.)
	 * 
	 * @param url
	 * @param userName
	 * @param userPassWd
	 * @param driver
	 */
	public void DbConfigProcess(String url, String userName, String userPassWd,
			String driver) {
		selenium.windowMaximize();
		waitForPageReactivity();// wait to judge "no license" popup or not

		if (selenium.isTextPresent("No license set")) {
			selenium.click("idLoginOpenDbConfigButton");
		} else {
			waitForElementPresent("idLoginOpenDbConfigButton", WAIT_TIME);
			selenium.click("idLoginOpenDbConfigButton");
		}

		selenium.type("idDbConfigLoginPasswordInput", "admin");
		selenium.click("idDbConfigSubmitButton");
		selenium.type("idDbConfigUrlInput", url);
		selenium.type("idDbConfigUserNmeInput", userName);
		selenium.type("idDbConfigPasswordInput", userPassWd);
		selenium.type("idDbConfigDriverInput", driver);
		selenium.click("idDbConfigCheckButton");
		// some other action like "save" ......
	}

	/**
	 * The first time to open TAC ,there may be a delay. wait and judge this two
	 * condition: 1.license not set ,there will be an popup.click to go to
	 * dbConfig 2.license is already set, the go to dbConfig button will be
	 * seen,just click it.
	 */
	public void waitForPageReactivity() {
		boolean flag = selenium.isTextPresent("No license set")
				|| selenium.isElementPresent("idLoginOpenDbConfigButton");
		while (flag == false) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag = selenium.isTextPresent("No license set")
					|| selenium.isElementPresent("idLoginOpenDbConfigButton");
		}
	}

	/**
	 * wait and check the db Connection status
	 */
	public void waitForCheckConnectionStatus() {
		boolean flag = false;
		int seconds_Counter = 0;
		while (flag == false) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag = selenium.getXpathCount("//div[text()='OK']").intValue() == 3;
			seconds_Counter++;
			if(seconds_Counter >= WAIT_TIME)
				assertTrue(selenium.getXpathCount("//div[text()='OK']").intValue() == 3);
		}

	}
}

package pages;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	@Test (enabled = true, priority = 1)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
   @Test(enabled = true, priority = 2)
   public void clickUserIdTest() throws InterruptedException {
	   homePage.clickUserId();
   }
   @Test(enabled = true, priority = 3)
   public void inputTextUserIdFieldTest() throws InterruptedException {
	   homePage.inputTextUserIdField();
   }
  @Test(enabled = true, priority = 4)
  public void clickPasswordTest() throws InterruptedException {
	  homePage.clickPassword();
  }
  @Test(enabled = true, priority = 5)
  public void inputTextToPasswordtest() throws InterruptedException {
	  homePage.inputTextPassword();
	  Thread.sleep(5000);
  }
 
  @Test(enabled = true, priority = 6)
  public void clickLoginButtonTest() throws InterruptedException {
	  homePage.clickLogInButton();
  }
  @Test(enabled = false)
  public void clickCloseButtonTest() throws InterruptedException {
	  homePage.clickCloseButton();
	  
  }
  @Test(enabled = true, priority =7)
  public void forgotUserIdTest() throws InterruptedException {
	  homePage.forgotUserId();
	  
  }
  @Test(enabled = true, priority = 8)
  public void clickEnterFirstNameTest() throws InterruptedException {
	  homePage.forgotUserId();
	  homePage.clickEnterFirstName();
  }
  @Test(enabled = true, priority = 9)
  public void clickEnterLastNameTest() throws InterruptedException {
	  homePage.forgotUserId();
	  homePage.clickEnterLastName();
  }
  

	//we can also call all together using home page object and call all method, 
  // but this way if any line fails then it will not go to the next line.
	/*@Test(enabled = true)
public void testAll() throws InterruptedException {
	homePage.clickLogo();
	homePage.clickUserId();
	homePage.inputTextUserIdField();
	homePage.clickPassword();
	homePage.inputTextPassword();
	homePage.clickLogInButton();
	homePage.clickCloseButton();
	homePage.forgotUserId();
	homePage.clickEnterFirstName();
	homePage.clickEnterLastName();
}*/
}
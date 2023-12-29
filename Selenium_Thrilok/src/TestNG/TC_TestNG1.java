package TestNG;

import org.testng.annotations.Test;

public class TC_TestNG1 {

	@Test
	public void login() {
		System.out.println("login completed");
	}

	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout completed");
	}

}//Note: in above example logout method will get executed only in case of login
//method got passed otherwise it will skip the logout method
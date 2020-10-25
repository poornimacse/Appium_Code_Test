package Test;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Pages;

public class TestCase extends AmazonApp {
	
	@Test(priority =0)
	public void loginToApp() {
		Pages obj1 = new Pages(driver);
		String email = "appiumcodetest@gmail.com";
		String passCode ="Abcd@1234";
		obj1.loginPage(email, passCode);
		System.out.println("Logged In Successfully");
	}
	
	@Test(priority =1)
	public void searchTv(TouchActions action) {
		Pages obj2 = new Pages(driver);
		String itemName = "64 inch Tv";
		obj2.searchItem(itemName, action);
		}
	@Test(priority=2)
	public void addItemToCart(TouchActions action) {
		Pages obj3 = new Pages(driver);
		obj3.addToCart();
		}
	@Test(priority=3)
	public void addDeliveryAddress(TouchActions action) {
		Pages obj4 = new Pages(driver);
		obj4.addAddress(action);
		}
	@Test(priority=4)
	public void proceedItemToBuy(TouchActions action) {
		Pages obj5 = new Pages(driver);
		obj5.proceedToBuy(action);
		}
	}

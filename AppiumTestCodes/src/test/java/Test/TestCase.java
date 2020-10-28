package Test;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Pages;

public class TestCase extends AmazonApp {
	
	@Test(priority =0)
	public void loginToApp() {
		Pages login = new Pages(driver);
		String email = "appiumcodetest@gmail.com";
		String passCode ="Abcd@1234";
		login.loginPage(email, passCode);
		System.out.println("Logged In Successfully");
	}
	
	@Test(priority =1)
	public void searchTv(TouchActions action) {
		Pages searchItem = new Pages(driver);
		String itemName = "64 inch Tv";
		searchItem.searchItem(itemName, action);
		}
	@Test(priority=2)
	public void addItemToCart(TouchActions action) {
		Pages addItem = new Pages(driver);
		addItem.addToCart();
		}
	@Test(priority=3)
	public void addDeliveryAddress(TouchActions action) {
		Pages addDeliveryAddress = new Pages(driver);
		addDeliveryAddress.addAddress(action);
		}
	@Test(priority=4)
	public void proceedItemToBuy(TouchActions action) {
		Pages buyItem = new Pages(driver);
		buyItem.proceedToBuy(action);
		}
	}

package Pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import Test.AmazonApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Pages extends AmazonApp {
	AppiumDriver driver;
	@FindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
	MobileElement signInButton;
	@FindBy(id = "ap_email_login")
	MobileElement emailId;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget."
			+ "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android."
			+ "webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android."
			+ "view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view."
			+ "View[4]/android.widget.Button) MobileElement continue_Button")
	MobileElement continueButton;
	@FindBy(id = "ap_password")
	MobileElement passWord;
	@FindBy(id = "signInSubmit")
	MobileElement loginButton;
	@FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
	MobileElement searchBox;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView\r\n"
			+ "")
	MobileElement selectedTv;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView\r\n"
			+ "")
	MobileElement tvPrice;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView\r\n"
			+ "")
	MobileElement tvTittle;
	@FindBy(id = "add-to-cart-button")
	MobileElement addToCart;
	@FindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_cart_image")
	MobileElement cartOption;
	@FindBy(id = "add-to-cart-button")
	MobileElement proceedToBuy;

	@FindBy(id = "address-ui-widgets-enterAddressFullName")
	MobileElement fullName;
	@FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
	MobileElement mobileNumber;
	@FindBy(id = "address-ui-widgets-enterAddressPostalCode")
	MobileElement pinCode;
	@FindBy(id = "address-ui-widgets-enterAddressLine1")
	MobileElement addressLine1;
	@FindBy(id = "address-ui-widgets-enterAddressLine2")
	MobileElement addressLine2;
	@FindBy(id = "address-ui-widgets-landmark")
	MobileElement landMark;
	@FindBy(id = "address-ui-widgets-enterAddressCity")
	MobileElement townName;
	@FindBy(id = "address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
	MobileElement stateDropdown;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[6]/android.widget.Button\r\n"
			+ "")
	MobileElement addAddress;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.widget.Button\r\n"
			+ "")
	MobileElement deliveryContinueButton;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.RadioButton/android.view.View\r\n"
			+ "")
	MobileElement payOnDeliver_radio;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button\r\n"
			+ "")
	MobileElement paymentContinueButton;

	public Pages(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginPage(String email, String passCode) {
		signInButton.click();
		emailId.click();
		emailId.clear();
		emailId.sendKeys(email);
		continueButton.click();
		passWord.click();
		passWord.clear();
		passWord.sendKeys(passCode);
		loginButton.click();
	}

	public void searchItem(String itemName, TouchActions action) {
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(itemName);
		searchBox.click();
		action.scroll(10, 100);
		action.perform();
		selectedTv.click();
		String actualPrice = tvPrice.getText();
		String expectedPrice = "150000";
		Assert.assertEquals(actualPrice, expectedPrice);
		String itemTitle = tvTittle.getText();
		String expectedTitle = "Philips 64 inch Tv";
		Assert.assertTrue(itemTitle.contains(expectedTitle));
		action.scroll(0, 50);
		addToCart.click();
	}

	public void addToCart() {
		cartOption.click();
		proceedToBuy.click();

	}

	public void addAddress(TouchActions action) {
		fullName.click();
		fullName.clear();
		fullName.sendKeys("Abc");
		mobileNumber.click();
		mobileNumber.clear();
		mobileNumber.sendKeys("9876543210");
		pinCode.click();
		pinCode.clear();
		pinCode.sendKeys("600042");
		action.scroll(0, 20);
		addressLine1.click();
		addressLine1.clear();
		addressLine1.sendKeys("ABC");
		addressLine2.click();
		addressLine2.clear();
		addressLine2.sendKeys("ABC");
		landMark.click();
		landMark.clear();
		landMark.sendKeys("ABC");
		townName.click();
		townName.clear();
		townName.sendKeys("ABC");
		Select select = new Select(stateDropdown);
		select.selectByVisibleText("TamilNadu");
		action.scroll(0, 20);
		addAddress.click();
	}

	public void proceedToBuy(TouchActions action) {
		action.scroll(deliveryContinueButton, 0, 50);
		deliveryContinueButton.click();
		payOnDeliver_radio.click();
		paymentContinueButton.click();

	}

}

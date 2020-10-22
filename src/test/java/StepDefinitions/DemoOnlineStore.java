package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import utilities.WebActions;

public class DemoOnlineStore {
	WebActions webAction=null;

	@Given("^user Launch url \"([^\"]*)\"$")
	public void user_launch_url(String url)  {
		webAction= new WebActions(url);
	}

	@When("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to(String data) throws InterruptedException  {
		Thread.sleep(3000);
		Assert.assertTrue(webAction.click("xpath", ".//*[text()='"+data+"']"));
	}

	@Then("^user validates expected products \"([^\"]*)\" are visible$")
	public void user_validates_expected_products_are_visible(String data) {

		for(String item: data.split(",")){
			Assert.assertTrue(webAction.elementPresent("xpath",".//*[@class='card-title']/a[contains(text(),'"+item.trim()+"')]"));
		}

	}

	@When("^user click product \"([^\"]*)\"$")
	public void user_click_product(String data) throws InterruptedException  {
		Assert.assertTrue(webAction.click("xpath",".//*[@class='card-title']/a[text()='"+data+"']"));
		Thread.sleep(3000);
	}

	@Then("^user add product to cart$")
	public void user_add_product_to_cart()  {
		Assert.assertTrue(webAction.click("xpath",".//*[@class='btn btn-success btn-lg'][text()='Add to cart']"));
	}

	@When("^user accept pop up confirmation$")
	public void user_accept_pop_up_confirmation() throws InterruptedException {
		Thread.sleep(4000);
		webAction.getDriver().switchTo().alert().accept();
		webAction.getDriver().switchTo().defaultContent();
	}

	@Then("^user move to \"([^\"]*)\"$")
	public void user_move_to_home(String data)  {
		Assert.assertTrue(webAction.click("xpath",".//*[@class='navbar-nav ml-auto']/li/a[contains(text(),'"+data+"')]"));
	}


	@Then("^user verifies product are there \"([^\"]*)\"$")
	public void user_verifies_product_are_there(String data)  {
		for(String item: data.split(",")){
			Assert.assertTrue(webAction.elementPresent("xpath",".//*[@class='success']/td[contains(text(),'"+item.trim()+"')]"));
		}


	}

	@When("^user delete product \"([^\"]*)\"$")
	public void user_delete_product(String data)  {
		for(String item: data.split(",")){
			Assert.assertTrue(webAction.click("xpath",".//td[contains(text(),'"+item.trim()+"')]/parent::tr/td/a"));
		}
	}

	@Then("^user verify product is deleted \"([^\"]*)\"$")
	public void user_verify_product_is_deleted(String data) throws InterruptedException  {
		Thread.sleep(5000);
		for(String item: data.split(",")){
			Assert.assertFalse(webAction.elementPresent("xpath",".//*[@class='success']/td[contains(text(),'"+item.trim()+"')]"));
		}
	}

	@When("^user click on Place order$")
	public void user_click_on_place_order()  {

		Assert.assertTrue(webAction.click("xpath",".//button[contains(text(),'Place Order')]"));
	}

	@Then("^user fill form fields$")
	public void user_fill_form_fields() {
		Assert.assertTrue(webAction.enterData("xpath", ".//input[@id='name']", "JOHN"));    
		Assert.assertTrue(webAction.enterData("xpath", ".//input[@id='country']", "INDIA"));    
		Assert.assertTrue(webAction.enterData("xpath", ".//input[@id='city']", "DELHI"));    
		Assert.assertTrue(webAction.enterData("xpath", ".//input[@id='card']", "4005550000000000"));    
		Assert.assertTrue(webAction.enterData("xpath", ".//input[@id='month']", "0521"));    
		Assert.assertTrue(webAction.enterData("xpath", ".//input[@id='year']", "2023"));    
	}

	Double purchaseAmt=0.0;
	@Then("^user capture total amount from the pop-up$")
	public void user_capture_total_amount_from_the_pop_up() {
		purchaseAmt=Double.parseDouble(webAction.getDriver().findElement(By.xpath(".//*[@id='totalm']")).getText().replace("Total:", "").trim());   
	}

	@When("^user click on purchase$")
	public void user_click_on_purchase(){
		Assert.assertTrue(webAction.click("xpath",".//button[text()='Purchase']"));
	}

	Double paidAmt=0.0;
	@Then("^user capture purchase ID and Amount$")
	public void user_capture_purchase_id_and_amount() {
		
		String[] PaymentInfo=webAction.getDriver().
				findElement(By.xpath(".//*[@class='lead text-muted ']")).getText().split("\\r?\\n");
		
		paidAmt=Double.parseDouble(PaymentInfo[1].replace("Amount:", "").replace("USD", "").trim());
		String OrderID=PaymentInfo[0];

		Assert.assertTrue("Order ID is : "+OrderID, true);
		Assert.assertTrue("Payed Amount is : "+paidAmt, true);	
	}

	@Then("^user verify amount should match to urchase amount$")
	public void user_verify_amount_should_match_to_urchase_amount() {
		Assert.assertEquals(paidAmt, purchaseAmt);
		
	}
	
	@Then("^close browser$")
	public void close_browser(){
		webAction.getDriver().quit();
	}

}

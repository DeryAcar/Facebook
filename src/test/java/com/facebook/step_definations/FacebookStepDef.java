package com.facebook.step_definations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.facebook.page.FacebookLocators;
import com.fcebook.utilities.Config;
import com.fcebook.utilities.Drivers;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FacebookStepDef {
	FacebookLocators page =new FacebookLocators();
	
	@Given("^User on sign in page$")
	public void user_on_sign_in_page() throws Throwable {
	  Drivers.getDriver().get(Config.getProperty("url"));
	}

	@When("^User click create new account button$")
	public void user_click_create_new_account_button() throws Throwable {
	   page.yeniHesapOlstur.click();
	Thread.sleep(3000);
	}

	@Then("^User able to see sign up title$")
	public void user_able_to_see_sign_up_title() throws Throwable {
	  Assert.assertTrue(page.title.isDisplayed());
	Thread.sleep(3000);
	}
	@Then("^User able to see sign up subtittle$")
	public void user_able_to_see_sign_up_subtittle() throws Throwable {
	  Assert.assertTrue(page.subtitle.isDisplayed()); 
	  Thread.sleep(3000);
	}
	@Then("^User able to see firstname label$")
	public void user_able_to_see_firstname_label() throws Throwable {
		String firstName= page.firstName.getAttribute("aria-label");
		Assert.assertEquals(firstName, "Ad�n");
		Thread.sleep(3000);
	}
	@Then("^User able to see lastname label$")
	public void user_able_to_see_lastname_label() throws Throwable {
		Assert.assertTrue(page.lastName.isDisplayed()); 
	}

	@Then("^User able to see mobile number or email label$")
	public void user_able_to_see_mobile_number_or_email_label() throws Throwable {
		Assert.assertTrue(page.numberOrEmail.isDisplayed()); 
	}

	@Then("^User able to see new password label$")
	public void user_able_to_see_new_password_label() throws Throwable {
		Assert.assertTrue(page.password.isDisplayed()); 
	}

	@Then("^User able to see birtday header$")
	public void user_able_to_see_birtday_header() throws Throwable {
		Assert.assertTrue(page.birthday.isDisplayed()); 
	}

	@Then("^User able to see gender header$")
	public void user_able_to_see_gender_header() throws Throwable {
		Assert.assertTrue(page.gender.isDisplayed()); 
	}

	@Then("^User able to see sign up button text$")
	public void user_able_to_see_sign_up_button_text() throws Throwable {
		Assert.assertTrue(page.signInButton.isDisplayed()); 
	}
}
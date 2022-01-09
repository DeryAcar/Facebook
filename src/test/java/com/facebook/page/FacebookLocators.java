package com.facebook.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fcebook.utilities.Drivers;

public class FacebookLocators {
static WebDriver driver;
	
	public FacebookLocators() {
		this.driver=Drivers.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[class=\"fb_logo _8ilh img\"]")
	public WebElement signInPage;
	
	@FindBy(xpath="//a[text()=\"Yeni Hesap Oluþtur\"]")
	public WebElement yeniHesapOlstur;
	
	@FindBy(xpath="//div[text()=\"Kaydol\"]")
	public WebElement title;
	
	@FindBy(xpath="//div[text()=\"Hýzlý ve kolaydýr.\"]")
	public WebElement subtitle;
	
	@FindBy(css="input[name='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath="//div[text()=\"Soyadýn\"]")
	public WebElement lastName;
	@FindBy(xpath="//div[text()=\"Cep telefonu numarasý veya e-posta\"]")
	public WebElement numberOrEmail;
	
	@FindBy(xpath="//div[text()=\"Yeni þifre\"]")
	public WebElement password;
	
	@FindBy(xpath="//div[text()=\"Doðum Tarihi\"]")
	public WebElement birthday;
	
	@FindBy(xpath="//div[text()=\"Cinsiyet\"]")
	public WebElement gender;
	
	
	@FindBy(xpath="//div[@class=\"_1lch\"]//button[text()=\"Kaydol\"]")
	public WebElement signInButton;	
}

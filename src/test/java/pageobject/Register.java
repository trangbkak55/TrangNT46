package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	private WebDriver driver;
	
	@FindBy(css="div.mod-login-input-phone>input")
	public WebElement txtSDT;
	@FindBy(css="button.nc_iconfont btn_slide")
	public WebElement btnTruot;
	@FindBy(css="div.mod-login-input-password>input[type=text]")
	public WebElement txtMatKhau;
	@FindBy(css="div.mod-birthday-month>span")
	public WebElement txtThang;
	@FindBy(css="span.mod-birthday-day")
	public WebElement txtNgay;
	@FindBy(css="span.mod-birthday-year")
	public WebElement txtNam;
	@FindBy(css="span.mod-login-gender")
	public WebElement txtChon;
	@FindBy(css="div.mod-login-input-name>input")
	public WebElement txtTen;
	@FindBy(css="div.mod-login-input-email>input")
	public WebElement txtEmail;
	@FindBy(css="button.next-btn-primary")
	public WebElement btnSubmit;
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

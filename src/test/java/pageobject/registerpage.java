package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class registerpage {
	private WebDriver driver;
	
	//Trang http://testmaster.vn/
	@FindBy(css="div.col-sm-9>input[type=email]")
	public WebElement txtEmail;
	@FindBy(css="div:nth-child(3)>span")
	public WebElement lbEmailError;
	@FindBy(css="button.next-btn-primary")
	public WebElement btnDky;
	@FindBy(css="div#popover")
	public WebElement popupExtra;
	@FindBy(css="div.popover-body>p:nth-child(3)>input")
	public WebElement txtHoTen;
	@FindBy(css="div.popover-body>p:nth-child(3)>span")
	public WebElement lbHoTenError;
	@FindBy(css="#ddlGender")
	public WebElement cbGioiTinh;
	@FindBy(css="div.popover-body>div.col-sm-5>div.dropdown.open>ul>li:nth-child(1)>a")
	public WebElement lbMale;
	@FindBy(css="#ddlNewsType")
	public WebElement cbLoaiTin;
	@FindBy(css="div.popover-body>div.col-sm-7>div.dropdown.open>ul>li:nth-child(1)>a")
	public WebElement lbTin;
	@FindBy(css="button.primary.popover-button")
	public WebElement btnConfirm;
	
	//Trang https://www.lazada.vn
	@FindBy(css="[id=q]")
	public WebElement txtTimKiem;
	@FindBy(css="button.search-box__button--1oH7")
	public WebElement btnTKiem;
	
	
	public registerpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
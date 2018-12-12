package trangnt46.day4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.registerpage;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	registerpage registerPage;
	@Before
	public void InitTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testmaster.vn/");
		this.registerPage = new registerpage(this.driver);
	}
	
	@After
	public void CloseTest()
	{
		this.driver.close();
	}
	
	//Bài 1: **********************
	@Ignore
    @Test
    public void Check_Register_With_Blank_Values()
    {
		registerPage.txtEmail.clear();
		registerPage.btnDky.click();
    	
    	String emailError = registerPage.lbEmailError.getText();
    	
    	Boolean result = emailError.indexOf("Email không đúng định dạng")!=-1;
    	assertTrue(result);
    }
    
    @Ignore
    @Test
    public void Check_Register_with_invalid_values()
    {
    	registerPage.txtEmail.clear();
    	registerPage.btnDky.click();
    	
    	registerPage.txtEmail.sendKeys("abc123");
    	String emailError = registerPage.lbEmailError.getText();

		Boolean result = emailError.indexOf("Email không đúng định dạng")!=-1;
    	assertTrue(result);
    	
    }
    
	@Ignore
    @Test
    public void Check_Register_with_valid_values()
    {
		registerPage.txtEmail.clear();
		registerPage.btnDky.click();
    	
		registerPage.txtEmail.sendKeys("a@gmail.com");
    	String emailError = registerPage.lbEmailError.getText();

		Boolean result = emailError.indexOf("Email đã tồn tại, vui lòng nhập email khác")!=-1;
    	assertTrue(result);
    }
	
	@Ignore
    @Test
    public void Check_Register_with_account_not_existed()
    {
		registerPage.txtEmail.clear();
		registerPage.btnDky.click();
		registerPage.txtEmail.sendKeys("trangbka@gmail.com");
		
    	assertTrue(registerPage.popupExtra.isDisplayed());
    }
	
    //Bài 2: **************** Đăng ký không thấy thông báo, cũng không nhận được mail
	@Ignore
    @Test
    public void Check_HoTen_Rong()
    {
		registerPage.txtHoTen.clear();
		registerPage.btnConfirm.click();
    	
    	String hoTenError = registerPage.lbHoTenError.getText();
    	
    	Boolean result = hoTenError.indexOf("Họ tên không được để trống")!=-1;
    	assertTrue(result);
    }
	
	@Ignore
    @Test
    public void Check_HoTen_with_invalid_values()
    {
		registerPage.txtHoTen.clear();
		registerPage.btnConfirm.click();
    	
		registerPage.txtHoTen.sendKeys("123@#$%!&");
    	String hoTenError = registerPage.lbHoTenError.getText();

		Boolean result = hoTenError.indexOf("Họ tên không hợp lệ")!=-1;
    	assertTrue(result);
    	
    }
}
package viettel.autotest2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import pageobject.Register;
import pageobject.loginpage;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;
    /*
    @Test
    public void firstTestCase()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TrangMyl\\Downloads\\chromedriver.exe");
    	driver= new ChromeDriver();
    	
    	driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
    	
    	//Nhap Username
    	loginpage lgPage = new loginpage(driver);
    	lgPage.txtUserName.sendKeys("khanh.tx@live.com");
    	
        assertTrue( true );
    }
    */
    
    @Test
    public void DangKy()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TrangMyl\\Downloads\\chromedriver.exe");
    	driver= new ChromeDriver();
    	
    	driver.get("https://member.lazada.vn/user/register?spm=a2o4n.login_signup.header.d6.51ba705bqsqARY");
    	
    	//Nhap thongtin
    	Register DKPage = new Register(driver);
    	DKPage.txtSDT.sendKeys("0969367092");
    	DKPage.txtMatKhau.sendKeys("123456");
    	DKPage.txtThang.click();
    	DKPage.txtNgay.click();
    	DKPage.txtNam.click();
    	DKPage.txtChon.click();
    	DKPage.txtTen.sendKeys("Nguyen Trang");
    	DKPage.txtEmail.sendKeys("trangbkak55@gmail.com");
    	
        assertTrue( true );
    }
    
}

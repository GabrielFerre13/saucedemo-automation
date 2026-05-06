package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

 @FindBy(id = "user-name")
    public WebElement txtuser;

 @FindBy(id = "password")
    public WebElement txtpassword;

 @FindBy(id = "login-button")
    public  WebElement btnlogin;

 @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
   public WebElement btnproduct;

 @FindBy(id = "add-to-cart")
 public WebElement btnaddcart;

 @FindBy(xpath = "//*[@data-test='shopping-cart-link']")
 public WebElement btncart;

 @FindBy(id = "checkout")
 public WebElement btncheckout;




 public void fazerLogin(String user, String password){
     txtuser.sendKeys(user);
     txtpassword.sendKeys(password);
     btnlogin.click();
 }

 public void addcart(){
     btnaddcart.click();
 }

 public void opencart(){
     btncart.click();
 }

 public void checkout(){
     btncheckout.click();
 }
}

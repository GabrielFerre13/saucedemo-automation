package Interactions;

import Pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



import static steps.Hooks.driver;

public class BuyInteractions {
    LoginPage loginPage;

    public BuyInteractions(LoginPage loginPage){
        this.loginPage = loginPage;
    }

    public void escolhaItem() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.btnproduct));
        Thread.sleep(1500);
        loginPage.btnproduct.click();
        Thread.sleep(2000);
    }

    public void realizaCompra() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.btnaddcart));
        Thread.sleep(1500);
        loginPage.btnaddcart.click();

        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.btncart));
        Thread.sleep(1500);
        loginPage.btncart.click();

        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.btncheckout));
        Thread.sleep(1500);
        loginPage.btncheckout.click();
    }

}

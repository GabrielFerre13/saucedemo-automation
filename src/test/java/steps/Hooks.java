package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Hooks {

    public static WebDriver driver;

    @Before

    public void abrirNavegador() {
        WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       Map<String,Object> prefs = new HashMap<>();
       prefs.put("credentials_enable_service", false);
       prefs.put("profile.password_manager_enabled", false);
       prefs.put("profile.password_manager_leak_detection", false);

       options.setExperimentalOption("prefs", prefs);
       options.addArguments("--disable-notifications");
       options.addArguments("--disable-infobars");

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @After

    public void fecharNavegador () {
        driver.quit();
    }
}

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Open {

        private By btnAccept = By.xpath("//div[@class='sc-3acf7193-2 kUcLXW']//button[@class='sc-eda0895a-2 kcvQDI']");
    private By img = By.xpath("//main[@id='mainContent']");
    private By btnLithuania = By.xpath("//a[@data-test-id='front-country-link-LTU']");
    private By Field = By.xpath("//input[@id='front-page-input']");
    private By Enter = By.xpath("//input[@id='front-page-input']");
    @Test
        public  void Wolt () {
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://wolt.com");
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            driver.findElement(btnAccept).click();
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            driver.findElement(img).click();
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            driver.findElement(btnLithuania).click();
        driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        driver.findElement(Field).sendKeys("Vilnius" );
        driver.findElement(Enter).sendKeys(Keys.ENTER);
        }
    }


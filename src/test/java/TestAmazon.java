import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAmazon {
    WebDriver driver;
    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By cookiesSelector = By.name("accept");
        driver.findElement(cookiesSelector).click();
    }

    @Test
    public void testAmazon(){
        //Act
        HomePage amazonHomePage = new HomePage(driver);
        amazonHomePage.search().enterText().resultSearch();
        //Asserts
        String inputText= new ContainsTrue(driver).displayedText();
        Assert.assertTrue(inputText.contains("Nintendo Switch"));

    }

    @AfterMethod
    public void fermerChrome() {
        driver.quit();
    }

}

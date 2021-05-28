import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductTitle {
    WebDriver driver;
    private static By productTitle= By.id("productTitle");

    public ProductTitle(WebDriver driver){
        this.driver=driver;
    }

    public String IsDisplayedText(){
       return driver.findElement(productTitle).getText();
    }


}

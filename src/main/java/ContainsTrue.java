import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class contrainsTrue {
    WebDriver driver;

    public contrainsTrue(WebDriver driver){
        this.driver=driver;
    }

    public String displayedText(){
       return driver.findElement(By.id("productTitle")).getText();
    }


}

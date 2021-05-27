import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTextArea {

    WebDriver driver;
    public  static String enteredText= "nitendo switch";

    public SearchTextArea(WebDriver driver){
        this.driver=driver;
    }

    public SearchResult enterText(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(enteredText);
        driver.findElement(By.id("nav-search-submit-text")).click();

        return  new SearchResult(driver);

    }

}

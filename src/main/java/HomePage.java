import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public  static String enteredText= "nitendo switch";
    public static By tabSearchText= By.id("twotabsearchtextbox");
    public static By navSearchSubmit= By.id("nav-search-submit-text");
    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public HomePage search(){
        return this;


    }
    public SearchResult enterText(){
        driver.findElement(tabSearchText).sendKeys(enteredText);
        driver.findElement(navSearchSubmit).click();

        return  new SearchResult(driver);

    }

}

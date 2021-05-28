import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResult {
    WebDriver driver;

    public SearchResult(WebDriver driver){
        this.driver=driver;
    }
    public ProductTitle resultSearch(){

        driver.findElement(By.cssSelector(".a-carousel-card[aria-posinset='1']  .a-size-mini .a-size-base-plus")).click();

        return new ProductTitle(driver);


    }
}

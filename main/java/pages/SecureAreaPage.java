package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    //Fields with located elements (only can use inside of this class because its private)
    private WebDriver driver;
    private By statusAllert=By.id("flash");

    //Constructor
    public SecureAreaPage(WebDriver driver){
        this.driver=driver;
    }
    //Method for getting text value from statusAllert field - return type
    public String getAllertText(){
        return driver.findElement(statusAllert).getText();
    }
}

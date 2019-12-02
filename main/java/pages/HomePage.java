package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Fields
    private WebDriver driver;
    private By formAuthetnticationLink=By.linkText("Form Authentication");
    //Constructor for initialization of driver
    public  HomePage (WebDriver driver){
        this.driver=driver;
    }
    //Method for clicking on element
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthetnticationLink).click();
        return new LoginPage(driver);
    }

}

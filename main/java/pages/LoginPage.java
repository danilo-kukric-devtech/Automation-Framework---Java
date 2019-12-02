package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    // Fields with located elements
    private WebDriver driver;
    private By userNameField=By.id("username");
    private By password=By.id("password");
    private By loginButton= By.cssSelector("#login button");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    //Method for setting text inside the element
    public void setUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    //Method for setting text inside the element
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    //Method for clicking on the element. This is a method with return type
    // so we need to return class with given driver
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}

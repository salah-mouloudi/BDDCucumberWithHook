package tdBankHomePage;

import baseAPI.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static tdBankHomePage.TDBankLocators.*;

public class TDBankHomePage extends BaseAPI {

@FindBy(xpath = webElementSignIn )
    public WebElement signIn;

 public void doSignIn () throws InterruptedException {
//     WebDriverWait wait = new WebDriverWait(driver, 10);
//     wait.until(ExpectedConditions.elementToBeClickable(signIn));
     Thread.sleep(2000);


     signIn.click();


 }


}

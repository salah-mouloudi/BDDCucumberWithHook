package tdBankBase;

import baseAPI.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import tdBankHomePage.TDBankHomePage;
import tdBankHomePage.TDBankLocators;

import java.io.IOException;

public class Hooks extends BaseAPI {
    public static TDBankHomePage tdBankHomePage;
    public static TDBankLocators tdBankLocators;

    public static void init() {
        tdBankHomePage = PageFactory.initElements(driver, TDBankHomePage.class);
        tdBankLocators = PageFactory.initElements(driver, TDBankLocators.class);

    }

    @Before
    public void setUp_Init() throws IOException {
        TDBankConfig config = new TDBankConfig();

        config.loadProperties();
        init();
        System.out.println("*---------- Before Scenario >>>>>>>>>> [setUpBrowser]---------------*");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot(scenario);
       // Hooks.driver.quit();
//        driver.quit();
        System.out.println("*---------- After Scenario >>>>>>>>>>> [tearDown] -----------------*");
    }
}

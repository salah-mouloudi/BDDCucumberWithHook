package TDBankStepDefinitions;

import io.cucumber.java.en.*;
import tdBankHomePage.TDBankHomePage;

public class SignInStepdefinitions extends TDBankHomePage {
    @Given("the user navigate to TDBank Home page")
    public void the_user_navigate_to_td_bank_home_page() {
    }

    @When("the user clicks the SignIn Button")
    public void the_user_clicks_the_sign_in_button() throws InterruptedException {
        doSignIn();
    }


}

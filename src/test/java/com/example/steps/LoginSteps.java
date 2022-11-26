package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class LoginSteps extends BaseTest {

  @Given("User is on login page")
  public void UserIsOnLoginPage() {
    //kosong
  }

  @When("User input username {string}")
  public void UserInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @When("User input password {string}")
  public void UserInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @When("User tap button login")
  public void UserTapButtonLogin() {
    loginPage.LoginButton();
  }

  @Then("User successfully login")
  public void userSuccessfullyLogin() {
    //getText
    String titleText = calculatorPage.getTitle();
    Assertions.assertEquals("Calculator", titleText);
    //isDisplayed
    boolean isDisplayed = calculatorPage.checkHamburgerButton();
    Assertions.assertTrue(isDisplayed);
    //Hamcrest
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }
}

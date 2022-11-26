package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListSteps extends BaseTest {

  //Scenario 1
  @Given("User is already login")
    public void UserIsAlreadyLogin() {
    //kosong
  }

  @When("User go to list menu")
  public void UserGoToListMenu() {
    listPage.HamburgerButton();
    listPage.ListMenu();
  }

  @And("User do scroll list menu")
  public void UserDoScrollListMenu() {
    listPage.scrollList();
  }

  //Scenario 2
  @Then("User doing long press in the list")
  public void UserDoingLongPressInTheList() {
    listPage.longPressObject();
    }

    //Scenario 3
    @Then("User doing tap multiple times in the list")
    public void UserDoingTapMultipleTimesInTheList() {
    listPage.tapMultipleTimes();
    }

    //Scenario 4
    @Then("User doing scroll to text in the list")
    public void UserDoingScrollToTextInTheList() {
    listPage.scrollToText();
    }
}

package com.example.steps;

import com.example.BaseTest;
import com.example.app.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorSteps extends BaseTest {
    Calculator calculator = new Calculator();
    int a = 0;
    int b = 0;
    int total = 0;

    //Scenario 1
    @Given("User input Angka1 is {int}")
    public void userInputAngka1Is(int value) {
        calculatorPage.inputNumber1(value);
        a = value;
    }
    @And("User input Angka2 is {int}")
    public void userInputAngka2Is(int value) {
        calculatorPage.inputNumber2(value);
        b = value;
    }
    @When("User tap dropdown button")
    public void userTapDrapdownButton() {
        calculatorPage.DropdownButton();
    }

    @Then("User select operator button +")
    public void userSelectOperatorButton() {
        calculatorPage.OperatorPlusButton();
    }

    @Then("User tap equal button")
    public void userTapEqualButton() {
        total = calculator.add(a,b);
        calculatorPage.EqualButton();
    }

    @And("Label Hasil should be {int}")
    public void labelHasilShouldBe(int value) {
        assertThat(total).isEqualTo(value);
    }

    //Scenario 2
    @Then("User select operator button -")
    public void userSelectOperatorButtonMin() {
        calculatorPage.OperatorMinButton();
    }

    @Then("User reduction numbers tap equal button")
    public void userReductionNumbersTapEqualButton() {
        total = calculator.min(a,b);
        calculatorPage.EqualButton();
    }

    //Scenario 3
    @Then("User select operator button div")
    public void userSelectOperatorButtonDiv() {
        calculatorPage.OperatorDivButton();
    }

    @Then("User div numbers tap equal button")
    public void userDivNumbersTapEqualButton() {
        total = calculator.div(a,b);
        calculatorPage.EqualButton();
    }

    //Scenario 4
    @Then("User select operator button *")
    public void userSelectOperatorButtonMulti() {
     calculatorPage.OperatorMultiButton();
    }

    @Then("User multi numbers tap equal button")
    public void userMultiNumbersTapEqualButton() {
        total = calculator.multi(a,b);
        calculatorPage.EqualButton();
    }
}

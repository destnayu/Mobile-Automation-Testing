package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePage {

  public String getTitle() {
    By locator = MobileBy.xpath(
        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
    AndroidElement labelTitle = driver.findElement(locator);
    return labelTitle.getText();
  }

  public boolean checkHamburgerButton() {
    //explicit wait
    By locator = MobileBy.AccessibilityId("Buka panel navigasi");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public void inputNumber1(int number) {
    By locator = MobileBy.id("com.isl.simpleapp:id/et_1");
    AndroidElement inputNumber = driver.findElement(locator);
    inputNumber.clear();
    inputNumber.sendKeys(String.valueOf(number));
    type(MobileBy.id("com.isl.simpleapp:id/et_1"), String.valueOf(number));
  }
  public void inputNumber2(int number) {
    By locator = MobileBy.id("com.isl.simpleapp:id/et_2");
    AndroidElement inputNumber = driver.findElement(locator);
    inputNumber.clear();
    inputNumber.sendKeys(String.valueOf(number));
    type(MobileBy.id("com.isl.simpleapp:id/et_2"), String.valueOf(number));
  }
  public void DropdownButton(){
    By locatorDropdown = MobileBy.id("com.isl.simpleapp:id/spinner_1");
    AndroidElement buttonDropdown = driver.findElement(locatorDropdown);
    buttonDropdown.click();
  }

  public void OperatorPlusButton(){
    By locatorPlus = MobileBy.xpath(
            "//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
    AndroidElement buttonDropdown = driver.findElement(locatorPlus);
    buttonDropdown.click();
  }

  public void OperatorMinButton(){
    By locatorMin= MobileBy.xpath(
            "//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
    AndroidElement buttonDropdown = driver.findElement(locatorMin);
    buttonDropdown.click();
  }

  public void OperatorDivButton(){
    By locatorDiv= MobileBy.xpath(
            "//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
    AndroidElement buttonDropdown = driver.findElement(locatorDiv);
    buttonDropdown.click();
  }

  public void OperatorMultiButton(){
    By locatorMulti= MobileBy.xpath(
            "//android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
    AndroidElement buttonDropdown = driver.findElement(locatorMulti);
    buttonDropdown.click();
  }

  public void EqualButton(){
    By locatorEqual = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
    AndroidElement buttonDropdown = driver.findElement(locatorEqual);
    buttonDropdown.click();
  }
}
